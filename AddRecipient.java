public class AddRecipient {
    public AddRecipient(String text){
        String Text=text+"\n";
        WriteFile write=new WriteFile();
        write.Write_to_File("clientList.txt",Text);
    }
}
