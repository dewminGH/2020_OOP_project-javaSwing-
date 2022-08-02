//--IT20762568
//--W.B.M.S.R.Weerasekara
//////////////////////////
package My;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 *
 * @author ASUS
 */
public class Send_Email {
   
	
	public void Email(String Email,String Subject,String msg)
    {
    	
        final String From = "ezrustrepairc@gmail.com";
        final String password = "newPasw@123";
            
          Properties pros = new Properties();

        pros.put("mail.smtp.host", "smtp.gmail.com");
        pros.put("mail.smtp.socketFactory.port", "465");
        pros.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        pros.put("mail.smtp.auth", "true");
        pros.put("mail.smtp.port", "465");
        
        Session session = Session.getDefaultInstance(pros,
                
                new javax.mail.Authenticator() {
            
                protected PasswordAuthentication getPasswordAuthentication() 
            {
                return new PasswordAuthentication(From, password);
            }
            }
            );

        try 
        {
            Message message = new MimeMessage(session);
  
            message.setFrom(new InternetAddress(From));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(Email));
            message.setSubject(Subject); 
            message.setText(msg);
        
            Transport.send(message);
            System.out.print("sucsess");
            
           
            
            
			
                      
        } 
        catch(MessagingException e) 
        {
            System.out.print(e);
            
        }

   }
}
