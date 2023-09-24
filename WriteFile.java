import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteFile {
    public void Write_to_File(String FilePath, String content){
        File myObj = new File(FilePath);
        try {
            if (myObj.createNewFile()) {
                Files.write(Paths.get(FilePath), content.getBytes(), StandardOpenOption.APPEND);
            }
            else {                              //if file already exist
                Files.write(Paths.get(FilePath), content.getBytes(), StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
