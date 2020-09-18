
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
        while ((s=fr.readLine())!=null){
            if ((s.matches(".*\\b"+words.get(0)+"\\b.*")&&s.matches(".*\\b"+words.get(1)+"\\b.*"))||(s.matches(".*\\b"+words.get(1)+"\\b.*")
                    &&s.matches(".*\\b"+words.get(2)+"\\b.*"))||
                    (s.matches(".*\\b"+words.get(0)+"\\b.*")&&s.matches(".*\\b"+words.get(2)+"\\b.*")))
                System.out.println(s);
        }
        fr.close();
    }
}
