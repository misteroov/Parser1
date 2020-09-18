import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        BufferedWriter fw = new BufferedWriter(new FileWriter(args[1]));
        String s;
        while ((s = br.readLine()) != null) {

            Pattern p = Pattern.compile("((([a-zA-ZА-Яа-я]+\\d)|(\\d+[a-zA-ZА-Яа-я]+))[a-zA-ZА-Яа-я\\d]*)");

            Matcher m = p.matcher(s);
            while (m.find()) {
                String temp =m.group()+" ";

                fw.write(temp);
            }
        }
        br.close();
        fw.close();
    }
}