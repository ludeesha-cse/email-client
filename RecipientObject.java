import java.io.Serializable;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RecipientObject implements Serializable {
    private String Mail;
    private String Name;
    private String relation;
    private String birthday;
    private String position;
    private String NickName;
    private String Date;
    private String Subject;
    private String Mail_content;

    private static String Date(){
        Format f = new SimpleDateFormat("yyyy/MM/dd");
        String strDate = f.format(new Date());
        return strDate;
    }
    public void Create_recipient(String Line){
        Date=Date();
        String splitted[]= Line.split(",|: ");
        if (splitted[0].equals("Official")){
            relation=splitted[0];
            Name=splitted[1];
            Mail=splitted[2];
            position=splitted[3];
            birthday=null;
            NickName=null;
        }
        else if(splitted[0].equals("Office_friend")){
            relation=splitted[0];
            Name=splitted[1];
            Mail=splitted[2];
            position=splitted[3];
            birthday=splitted[4];;
            NickName=null;
        }
        else if(splitted[0].equals("Personal")){
            relation=splitted[0];
            Name=splitted[1];
            Mail=splitted[3];
            position=null;
            birthday=splitted[4];
            NickName=splitted[2];
        }
    }

    public void GetData(String Single_line){
        String[] Splited=Single_line.split(",",3);
        Mail = Splited[0];
        Subject = Splited[1];
        Mail_content = Splited[2];

        Date=Date();
    }

    public String GetName(){
        return Name;
    }
    public String GetMail(){
        return Mail;
    }
    public String GetRealation(){
        return relation;
    }
    public String GetNickName(){
        return NickName;
    }
    public String GetBirthday(){
        return birthday;
    }
    public String GetPosition(){
        return position;
    }
    public  String Get_Subject(){
        return Subject;
    }
    public String Get_Content(){
        return Mail_content;
    }
    public String Get_Date(){
        return Date;
    }
}
