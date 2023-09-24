
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {
    public ArrayList<RecipientObject> ObjList() {
        ArrayList<RecipientObject> ClientObjectList = new ArrayList<RecipientObject>();
        BufferedReader FileReader = null;
        try {
            String strCurrentLine;

            FileReader = new BufferedReader(new FileReader("clientList.txt"));

            while ((strCurrentLine = FileReader.readLine()) != null) {

                RecipientObject clientObject=new RecipientObject();
                clientObject.Create_recipient(strCurrentLine);
                ClientObjectList.add(clientObject);
            }

        }
        catch (IOException e) {
        }
        finally {

            try {
                if (FileReader != null)
                    FileReader.close();
            }
            catch (IOException ex) {
            }
        }
        return ClientObjectList;
    }

}
