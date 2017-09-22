/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.easyvox.tools.jdbc.connection;

import java.util.*;
//import org.postgresql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.sql.ResultSet;

/**
 *
 * @author Eric CRISPIN
 */
public class PGSQL_Connection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // The database connection
        Connection connection;
        // The statement
        Statement stmt = null;
        // The queryString
        String queryString = null;
        // ---- configure this for your site
        String driverName = "org.postgresql.Driver"; // POSTGRESQL JDBC driver
        String serverName = "localhost";
        String serverPort = "5432";
        String databaseName = "easyvox_wcc";

        String username = "easyvox";
        String password = "p@ssword";
        String connSSL = "false";

        // The URL that will connect to POSTGRESQL server
        // Syntax: jdbc:jdbc:postgresql://<server>[:<port>][/<database>]
        String jdbcUrl = "jdbc:postgresql://" + serverName + ":" + serverPort + "/" + databaseName;
        
        System.out.println("-------- PostgreSQL " + "JDBC Connection Testing ------------");
 
		try {
                    Class.forName(driverName);
		} catch (ClassNotFoundException cnfex) {
                        Logger.getLogger(PGSQL_Connection.class.getName()).log(Level.SEVERE, "Where is your PostgreSQL JDBC Driver? " + "Include in your library path!", cnfex);
			return;
		}
 
                Logger.getLogger(PGSQL_Connection.class.getName()).log(Level.INFO, "PostgreSQL JDBC Driver Registered!");
 
		try {
                    // Establish Connection to the database at URL with usename and password
                    Properties props = new Properties();
                    props.setProperty("user",username);
                    props.setProperty("password",password);
                    //props.setProperty("ssl",connSSL);
                    connection = DriverManager.getConnection(jdbcUrl, props);
                    System.out.println ("Ok, connection to the DB is working.");
		} catch (SQLException sqlex) {
                    Logger.getLogger(PGSQL_Connection.class.getName()).log(Level.SEVERE, "Connection Failed! Check output console", sqlex);
			return;
		}
 
		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
                
                connection.close();
    }
}
