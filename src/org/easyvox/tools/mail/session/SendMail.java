/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.easyvox.tools.mail.session;

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
        props.put("mail.smtp.host", smtpHost);
        props.put("mail.smtp.port", ""+smtpPort);
        // Create a mail session
        Session session = Session.getDefaultInstance(props, null);

        // Construct the message
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(from));
        msg.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
        msg.setSubject(subject);
        msg.setText(content);

        // Send the message
        try{
            System.out.println("try to send message");
            Transport.send(msg);
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
        send_email("smtp.free.fr", 25, "OpenWCC@free.fr", "yourEmail@gmail.com",
             "EASYVOX Test Send_Mail !!!", "Is it OK ?");
    }    
    
}
