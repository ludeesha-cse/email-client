import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.ObjectOutputStream;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String []args) throws IOException, ClassNotFoundException {
//        AddRecipient a2=new AddRecipient("Official: nimal,nimal@gmail.com,ceo,2000/10/10");
//        AddRecipient a3=new AddRecipient("khbib");
//        String str = "ge@kss,fo r,g,ee,kss";
//        String[] arrOfStr = str.split("@|\\,|\\ ");
//        for (String a : arrOfStr)
//            System.out.println(a);
////        System.out.println(arrOfStr[arrOfStr.length - 1]);
//        String Birthday="2000/10/10";
//        PrintBirthdayNames read=new PrintBirthdayNames("clientList.txt",Birthday);
//        SendEmailTLS test=new SendEmailTLS("ludeeshananayakkara@gmail.com","Test subject","helloooo");
//        test.SendMail();
        //System.out.println(java.time.LocalDate.now());
//        GetData Client101=new GetData("pnmludeeshananayakkara@gmail.com,Test subject,8882 kkkkjudsvbkkk");
//        File test = new File("Test.ser");
//        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Test.ser",true));
//        os.writeObject(Client101);

//        FileInputStream fileStream = new FileInputStream("Test.ser");
//         //Make an ObjectInputStream
//        ObjectInputStream os1 = new ObjectInputStream(fileStream);
//        ClientObject obj=(ClientObject)os1.readObject();




//        GetData test01 = (GetData)os1.readObject(); //creates a new object for GetData from saved file
//        System.out.println(test01.Get_address());
//        System.out.println(test01.Get_address());
//        GetData test02= (GetData)os1.readObject(); //creates a new object for GetData from saved file
//        System.out.println(test02.Get_address());

//        String newk="Office_friend: kamal,kamal@gmail.com,clerk,2000/12/12";
//        String arr[]=newk.split(",|: ");
//        for(int i = 0;i<5;i++){
//            System.out.println(arr[i]);

//        ReadFile Objlist=new ReadFile();//        ArrayList<ClientObject> newlist= Objlist.ObjList();
//        String teste= newlist.get(0).GetName();
//        System.out.println(teste);
//        String test2e= newlist.get(1).GetName();
//        System.out.println(test2e);
//
//        Format f = new SimpleDateFormat("MM/dd");
//        String strDate = f.format(new Date());
//        System.out.println("Current Date = "+strDate);

//        ReadFile Objlist=new ReadFile();
//        ArrayList<ClientObject> Obj_list= Objlist.ObjList();  //obj_list= maintained Object array for evry line in the text
//
//        Send_Birthday birthdaywish=new Send_Birthday();
//        birthdaywish.Send_Birthday_wishes(Obj_list);

        Deserialize_ser test=new Deserialize_ser();
        test.Deserialize("Test.ser","2022/08/03");
    }
}
