
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String>words = new ArrayList<String>();
    static {
        words.add("файл");
        words.add("вид");
        words.add("В");

    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        BufferedReader fr = new BufferedReader(new FileReader(fileName));
        String s;
        String [] arrayString;
        int count = 0;
        while ((s=fr.readLine())!=null){
           arrayString = s.split(" ");
           for (String s1:words){
               for (int i = 0; i <arrayString.length ; i++) {
                   if (s1.equals(arrayString[i]))
                       count++;
               }
           }
           if (count==2)
               System.out.println(s);
           count=0;
        }
        fr.close();
    }
}
