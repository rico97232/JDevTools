/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.easyvox.tools.date;

import java.util.*;
import java.text.*;


/**
 *
 * @author ecrispin
 */
public class CurrentDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        java.util.Calendar now = new java.util.GregorianCalendar();
        String tod = "";

        java.util.Date CallDate = new java.util.Date();
        
        String CallDate2 = ((now.get(now.YEAR) +"-"+(now.get(now.MONTH)+1)+"-"+ now.get(now.DAY_OF_MONTH)));

        String CallTime2 = (now.get(now.HOUR_OF_DAY))+":"+(now.get(now.MINUTE))+":"+(now.get(now.SECOND));

        if (now.get(now.HOUR_OF_DAY) < 12) {
            tod = "Morning";
        } else if (now.get(now.HOUR_OF_DAY) < 18) {
            tod = "Afternoon";
        } else {
            tod = "Evening";
        }
        
        System.out.println("Good " + tod + " the current date is " + CallDate2 + " Time: " + CallTime2);  
        
        System.out.println("Standard Date -> " + CallDate);
    }
    
}
