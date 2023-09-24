// Import the File class
import java.util.ArrayList;

public class PrintBirthdayNames {
    public void Print_The_Names(ArrayList<RecipientObject> Object_arr, String Birthday){
        int len=Object_arr.size();

        for(int i=0;i<len;i++){
            Object obj=Object_arr.get(i);
            String Bday=((RecipientObject) obj).GetBirthday();

            String Relation=((RecipientObject) obj).GetRealation();

            if (Relation.equals("Office_friend") || Relation.equals("Personal")){
                if(Bday.equals(Birthday)){
                    String name=((RecipientObject) obj).GetName();
                    System.out.println(name);
                }
            }
        }
    }
}
