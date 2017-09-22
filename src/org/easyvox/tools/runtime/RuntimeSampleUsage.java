/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.easyvox.tools.runtime;

/**
 *
 * @author S825230
 */
public class RuntimeSampleUsage {

   // a class that extends thread that is to be called when program is exiting
   static class Message extends Thread {

   @Override
   public void run() {
   System.out.println("Bye.");
   System.out.println("Running Shutdown Hook");
   }
   }    
    
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
   try {

   // register Message as shutdown hook
   Runtime.getRuntime().addShutdownHook(new Message());

   // print the state of the program
   System.out.println("Program is starting...");

   // cause thread to sleep for 3 seconds
   System.out.println("Waiting for 3 seconds...");
   Thread.sleep(3000);

   // print that the program is closing 
   System.out.println("Program is closing...");


   } catch (Exception e) {
   e.printStackTrace();
   }
   }
}
