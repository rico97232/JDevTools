/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.easyvox.tools.ldap.connection;

import java.net.ConnectException;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.AuthenticationException;
import javax.naming.AuthenticationNotSupportedException;
import javax.naming.CommunicationException;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

/**
 *
 * @author ecrispin
 */
public class LDAP_JNDI_Connection {
    
    private static DirContext ldapContext = null;

    public static void connect() throws NamingException, CommunicationException {

        try {
            String url = "ldap://192.168.4.28:389";
            String conn_type = "simple";
            String dn = "cn=LDAP Administrator,dc=ppn,dc=org,dc=in";
            String password = "easyvox";
            Hashtable<String, String> environment = new Hashtable<>();
            environment.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory");
            environment.put(Context.PROVIDER_URL,url);
            environment.put(Context.SECURITY_AUTHENTICATION,conn_type);
            environment.put(Context.SECURITY_PRINCIPAL,dn);
            environment.put(Context.SECURITY_CREDENTIALS, password);
            //Open Connection
            ldapContext = new InitialDirContext(environment);
            System.out.println("Bind successful");
            System.out.println(ldapContext.getEnvironment());
            
            // do something useful with the context...
            
            //Close connection
            ldapContext.close();
            
        } catch (AuthenticationNotSupportedException anex) {
            Logger.getLogger(LDAP_JNDI_Connection.class.getName()).log(Level.SEVERE, "The authentication is not supported by the server", anex);
        } catch (AuthenticationException aex) {
            Logger.getLogger(LDAP_JNDI_Connection.class.getName()).log(Level.SEVERE, "incorrect password or username", aex);
        } catch (CommunicationException commex) {
            Logger.getLogger(LDAP_JNDI_Connection.class.getName()).log(Level.SEVERE, "CommunicationException", commex);
            //System.exit(1);
        } catch (NamingException namex) {
            Logger.getLogger(LDAP_JNDI_Connection.class.getName()).log(Level.SEVERE, "error when trying to create the context", namex);
            //System.exit(1);
        } 
   
    }
    
    /**
     * @param args the command line arguments
     * @throws javax.naming.NamingException
     * @throws javax.naming.CommunicationException
     */
    public static void main(String[] args) throws NamingException, CommunicationException {
        // TODO code application logic here
        connect();
    }
    
}
