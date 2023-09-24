import java.io.IOException;
import java.util.ArrayList;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Send_Birthday {
    public static void Send_Birthday_wishes(ArrayList<RecipientObject> Object_arr) throws IOException {

        Format f1 = new SimpleDateFormat("MM/dd");
        String strDate = f1.format(new Date());

        Format f2 = new SimpleDateFormat("yyyy/MM/dd");
        String strDate_y_m_d = f2.format(new Date());

        String Last_wish_date=Deserialize_ser.Get_last_wish_date("Test.ser");
        if (strDate_y_m_d.equals(Last_wish_date)){
            return;
        }
        int len=Object_arr.size();
        for(int i=0;i<len;i++){
            RecipientObject obj=Object_arr.get(i);
            String Relation=((RecipientObject) obj).GetRealation();
            String Mail_adrs = ((RecipientObject) obj).GetMail();
            if (Relation.equals("Office_friend") || Relation.equals("Personal")){

                String Bitrh_Day_month=(((RecipientObject) obj).GetBirthday()).substring(5,10);

                if(Bitrh_Day_month.equals(strDate)) {
                    if (Relation.equals("Office_friend")) {
                        SendEmailTLS Birthday_mail = new SendEmailTLS(Mail_adrs, "Happy Birthday", "Wish you a Happy Birthday.\n -Ludeesha");
                        Birthday_mail.SendMail();
                        SerializeObj.SaveObject(Birthday_mail);
                    }
                    else if (Relation.equals("Personal")) {
                        SendEmailTLS Birthday_mail = new SendEmailTLS(Mail_adrs, "Happy Birthday","hugs and love on your birthday. \n -From your friend\nLudeesha");
                        Birthday_mail.SendMail();
                        SerializeObj.SaveObject(Birthday_mail);
                    }
                }
            }
        }
    }
}
