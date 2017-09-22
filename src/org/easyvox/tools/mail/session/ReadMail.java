/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.easyvox.tools.mail.session;

import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;

/**
 *
 * @author ecrispin
 */
public class ReadMail {

        public static void read_imap_email(String imapPort, String imapConnectionTimeout,
                            String storeHost, String storeUser, String storePassword,
                            String storeFolder)
            throws NoSuchProviderException, MessagingException, IOException {
        // Properties, Define the Protocole
        Properties props = new Properties();
        props.setProperty("mail.store.protocol", "imaps");
        props.setProperty("mail.imaps.port", imapPort);
        props.setProperty("mail.imaps.connectiontimeout", imapConnectionTimeout);
        props.setProperty("mail.imaps.timeout", imapConnectionTimeout);
        // Create a mail session
        Session session = Session.getDefaultInstance(props, null);

        try {
            //Access emails through store class
            Store store = session.getStore();
            store.connect(storeHost, storeUser, storePassword);
            Folder inbox = store.getFolder(storeFolder);

            //open the required folder in Read mode
            inbox.open(Folder.READ_ONLY);

            //get access to your email using 'Message' class as shown below and typecast the content of the mail to Multipart to read_imap_email the body of the email.
            Message msg = inbox.getMessage(inbox.getMessageCount());
            //Message msg = inbox.getMessage(inbox.getUnreadMessageCount());
            Address[] in = msg.getFrom();
            for (Address address : in) {
                System.out.println("FROM:" + address.toString());
            }
            Multipart mp = (Multipart) msg.getContent();
            BodyPart bp = mp.getBodyPart(0);
            System.out.println("SENT DATE:" + msg.getSentDate());
            System.out.println("SUBJECT:" + msg.getSubject());
            System.out.println("CONTENT:" + bp.getContent());
        } catch (NoSuchProviderException nspex) {
            nspex.printStackTrace();
            Logger.getLogger(ReadMail.class.getName()).log(Level.SEVERE, null, nspex);
            //System.exit(1);
        } catch (MessagingException mex) {
            mex.printStackTrace();
            Logger.getLogger(ReadMail.class.getName()).log(Level.SEVERE, null, mex);
            //System.exit(2);
        } catch (IOException ioex) {
            ioex.printStackTrace();
            Logger.getLogger(ReadMail.class.getName()).log(Level.SEVERE, null, ioex);
        }
   
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MessagingException, NoSuchProviderException, IOException {
        // TODO code application logic here
        read_imap_email("993", "5000", "imap.gmail.com", "yourEmail@gmail.com", "yourPassword", "INBOX");

    }
    
}
