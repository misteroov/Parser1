
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String>words = new ArrayList<>();
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
            if ((s.contains(words.get(0))&&s.contains(words.get(1)))||(s.contains(words.get(1))&&s.contains(words.get(2)))||
                    (s.contains(words.get(0))&&s.contains(words.get(2))))
                System.out.println(s);
        }
        fr.close();
    }
}
