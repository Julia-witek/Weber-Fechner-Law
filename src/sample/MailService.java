package sample;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.stereotype.Service;

//import javax.mail.*;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
//import java.sql.SQLOutput;
//import java.util.Properties;
//import java.util.logging.Level;
//import java.util.logging.Logger;


import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailService {
    private static String text;
    MailService(String text){
        this.text=text;
    }
    public static void sendMail(String recepient) throws Exception {

        System.out.println("prepering");

        Properties properties = new Properties();

        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String myAccountEmail = "WeberFechner12@gmail.com";
        String password = "WeberWeber12";

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }
        });

        Message message = prepareMessage(session, myAccountEmail, recepient);
            Transport.send(message);
        System.out.println("Message sent succesfully");
    }


    private static Message prepareMessage(Session session,
                                          String myAccountEmail,
                                          String recepient){

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress((recepient)));
            message.setSubject("Wyniki");
            message.setText(text);
            return message;
        } catch (Exception e) {
            Logger.getLogger(MailService.class.getName()).log(Level.SEVERE,null,e );
            // e.printStackTrace();
        }
        return null;
    }

}