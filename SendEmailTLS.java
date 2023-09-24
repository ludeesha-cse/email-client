import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.io.Serializable;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class SendEmailTLS implements Serializable {
    private static int Mail_count=0;
    private String Email_address;
    private String Subject;
    private String content;
    private String Date;

    public SendEmailTLS(String Email_address, String Subject, String content){
        this.Email_address=Email_address;
        this.Subject=Subject;
        this.content=content;
        Format f = new SimpleDateFormat("yyyy/MM/dd");
        String strDate = f.format(new Date());
        Date = strDate;


    }

    public void SendMail() throws IOException {
        Mail_count += 1;

        final String username = "ludeesha1829@gmail.com";
        final String password = "lugxouxvxzrjqitr";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("ludeesha1829@gmail.com"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(Email_address)
            );
            message.setSubject(Subject);
            message.setText(content);

            Transport.send(message);

            //System.out.println("Sent Successfully");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    public String Get_Mail(){
        return Email_address;
    }
    public String Get_Subject(){
        return Subject;
    }
    public String Get_Content(){
        return content;
    }
    public String Get_Date(){
        return Date;
    }

}
