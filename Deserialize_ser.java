import com.sun.nio.file.ExtendedWatchEventModifier;

import java.io.*;

public class Deserialize_ser {
    public void Deserialize(String File_path_name, String date) throws IOException, ClassNotFoundException {
        FileInputStream fileStream = new FileInputStream(File_path_name);
        ObjectInputStream deserialized_obj = null;
        SendEmailTLS Client_Obj = null;

        while (true) {
            try {
                deserialized_obj = new ObjectInputStream(fileStream);
                Client_Obj = (SendEmailTLS) deserialized_obj.readObject();
            } catch (EOFException eof) {
                return;
            }
            if (Client_Obj == null) {
                break;
            } else {
                if (Client_Obj.Get_Date().equals(date)) {
                    System.out.println("Recipient : " + Client_Obj.Get_Mail());
                    System.out.println("Subject: " + Client_Obj.Get_Subject());
                    System.out.println("Content: " + Client_Obj.Get_Content());
                    System.out.println("");
                }
            }

        }
        deserialized_obj.close();
        fileStream.close();
    }

    public static String Get_last_wish_date(String File_path_name) throws IOException {
        String today = null;
        try {
            FileInputStream fileStream = new FileInputStream(File_path_name);
            ObjectInputStream deserialized_obj = null;
            SendEmailTLS Client_Obj = null;

            while (true) {
                try {
                    deserialized_obj = new ObjectInputStream(fileStream);
                    Client_Obj = (SendEmailTLS) deserialized_obj.readObject();
                    today = Client_Obj.Get_Date();
                } catch (EOFException eof) {
                    return today;
                } catch (ClassNotFoundException e) {
                    return today;
                }
                if (Client_Obj == null) {
                    break;
                }
            }
            return today;
        } catch (FileNotFoundException e) {
            return today;
        }
    }
}
