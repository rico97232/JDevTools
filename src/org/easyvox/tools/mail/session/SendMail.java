/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.easyvox.tools.mail.session;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;

/**
 *
 * @author ecrispin
 */
public class SendMail {
    public static void send_email(String smtpHost, int smtpPort,
                            String from, String to,
                            String subject, String content)
            throws AddressException, MessagingException {
        // Properties
        java.util.Properties props = new java.util.Properties();
        //props.put("mail.smtp.auth", "true");
        //props.put("mail.smtp.starttls.enable", "true");        
        props.put("mail.smtp.host", smtpHost);
        props.put("mail.smtp.port", smtpPort);
        
        
        // Create a mail session
        Session session = Session.getDefaultInstance(props, null);

        // Construct the message
        // Create a default MimeMessage object.
        Message msg_email = new MimeMessage(session);
        
        // Set From: header field of the header.
        msg_email.setFrom(new InternetAddress(from));
        
        // Set To: header field of the header.
        msg_email.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
        
        // Set Subject: header field
        msg_email.setSubject(subject);
        
        // Create a multipar message
        Multipart multipart = new MimeMultipart();        
        
        // Create the body content message part
        BodyPart msg_email_BodyPart = new MimeBodyPart();
        msg_email_BodyPart.setText(content); // Now set the actual message
        multipart.addBodyPart(msg_email_BodyPart); // Set text message part

        // First attachment
        MimeBodyPart attachment_BodyPart1 = new MimeBodyPart();
        String filename = "/home/ecrispin/Documents/Help_SDK85-DEV_v0.1.pdf";
        DataSource source = new FileDataSource(filename);
        attachment_BodyPart1.setDataHandler(new DataHandler(source));
        attachment_BodyPart1.setFileName(filename);
        multipart.addBodyPart(attachment_BodyPart1);

        // Second attachment
        /*MimeBodyPart attachment_BodyPart2 = new MimeBodyPart();
        String filename2 = "/home/ecrispin/Documents/new_system.jpg";
        DataSource source2 = new FileDataSource(filename2);
        attachment_BodyPart2.setDataHandler(new DataHandler(source2));
        attachment_BodyPart2.setFileName(filename2);
        multipart.addBodyPart(attachment_BodyPart2); */       

        // Set the complete message parts
        msg_email.setContent(multipart);        
        
        
        // Send the message
        try{
            System.out.println("try to send message");
            Transport.send(msg_email);
                 System.out.println("it's done: message sent !!!");
        } catch (AddressException ae){
            System.out.println("AddressException" + ae);
            System.out.println("wtf: message no sent !!!");
        } catch (MessagingException me){
            System.out.println("MessagingException" + me);
            System.out.println("wtf: message no sent !!!");
        }
    }

    public static void main(String[] args) throws MessagingException {
        // Send a test message        
        //send_email("smtp.free.fr", 25, "OpenWCC@free.fr", "yourEmail@gmail.com",
        send_email("smtp.free.fr", 25, "Service_Client@yecri.net", "zrx1100r@gmail.com",
             "YECRI Test Send_Mail !!!", "Is it OK ?");
    }    
    
}
