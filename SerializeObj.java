import java.io.*;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.File;
//import java.io.ObjectOutputStream;

public class SerializeObj {
    public static void SaveObject(SendEmailTLS obj) throws IOException {
        File test = new File("Test.ser");
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Test.ser",true));
        os.writeObject(obj);
        os.close();
    }
}
