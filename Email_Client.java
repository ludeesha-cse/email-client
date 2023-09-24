// 200410K

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;


public class Email_Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ReadFile Objlist=new ReadFile();
        ArrayList<RecipientObject> Obj_list= Objlist.ObjList();  //obj_list= maintained Object array for evry line in the text

        Send_Birthday.Send_Birthday_wishes(Obj_list);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter option type: \n"
                + "1 - Adding a new recipient\n"
                + "2 - Sending an email\n"
                + "3 - Printing out all the recipients who have birthdays\n"
                + "4 - Printing out details of all the emails sent\n"
                + "5 - Printing out the number of recipient objects in the application");

        int option = scanner.nextInt();

        switch(option){

            case 1:
                // input format - Official: nimal,nimal@gmail.com,ceo
                // code to add a new recipient
                System.out.println("input format-Official: nimal,nimal@gmail.com,ceo");
                Scanner scanner1=new Scanner(System.in);
                String line =scanner1.nextLine();
                AddRecipient r1=new AddRecipient(line);
                break;

            case 2:
                // input format - email, subject, content
                //code to send an email
                System.out.println("input format- email,subject,content");
                Scanner scanner2=new Scanner(System.in);
                String mail_details = scanner2.nextLine();

                RecipientObject Client101=new RecipientObject();
                Client101.GetData(mail_details);
                String Mail_address=Client101.GetMail();
                String Mail_subject = Client101.Get_Subject();
                String Mail_content=Client101.Get_Content();

                SendEmailTLS Mail101=new SendEmailTLS(Mail_address,Mail_subject,Mail_content);
                Mail101.SendMail();
                SerializeObj.SaveObject(Mail101);
                break;
            case 3:
                System.out.println("Enter birthday in format - +");
                Scanner scanner3=new Scanner(System.in);
                String birthday= scanner3.nextLine();
                PrintBirthdayNames read=new PrintBirthdayNames();
                read.Print_The_Names(Obj_list,birthday);
                // input format - yyyy/MM/dd (ex: 2018/09/17)
                // code to print recipients who have birthdays on the given date
                break;
            case 4:
                System.out.println("Enter the Date in format - yyyy/MM/dd");
                Scanner scanner4=new Scanner(System.in);
                String Date= scanner4.nextLine();

                Deserialize_ser mail=new Deserialize_ser();
                mail.Deserialize("Test.ser",Date);
                // input format - yyyy/MM/dd (ex: 2018/09/17)
                // code to print the details of all the emails sent on the input date

                break;
            case 5:
                // code to print the number of recipient objects in the application
                int no_of_reciepient_object=Obj_list.size();
                System.out.println(no_of_reciepient_object);
                break;

        }

        // start email client
        // code to create objects for each recipient in clientList.txt
        // use necessary variables, methods and classes

    }
}

// create more classes needed for the implementation (remove the  public access modifier from classes when you submit your code)