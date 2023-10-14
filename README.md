# Automated Email Client system

In the project directory, you can run the 'Email_Client.java' file to run the program.

This is a system which was build to automatically manage and send emails to a predifined users.
This automatically check a client list provided by us and send birthday wishes according to their birthdays.

### Command-line options are be available for:

<ul>
  <li>Adding a new recipient</li>
  <li>Sending an email</li>  
  <li>Printing out all the names of recipients who have their birthday set to current date</li>
  <li>Printing out details (subject and recipient) of all the emails sent on a date specified by user input</li>
  <li>Printing out the number of recipient objects in the application</li>
</ul>

<p>When the email client is running, an object for each email recipient should be maintained in the application. 
For this, you will have to load the recipient details from the text file into the application. 
For each recipient having a birthday, a birthday greeting should be sent on the correct day.</p>  

## OOP Concepts Used
<ul>
  <li>Encapsulation</li>
  <li>Inheritance</li>  
  <li>Abstraction</li>
  <li>Polymorphism</li>
</ul>

You can run this program after changing the 'username' and 'password' in the 'SendEmailTLS.java' file.
 

        final String username = "test@gmail.com";
        final String password = "passwrd";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS
