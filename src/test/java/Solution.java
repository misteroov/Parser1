import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writter = new BufferedWriter(new FileWriter(args[1]));
        String s;
        String[] arrayStrings;
        List<String> list = new ArrayList<String>();
        while ((s = reader.readLine()) != null) {
            arrayStrings = s.split(" ");
            for (String z:arrayStrings){
                if (z.length()>6)
                    list.add(z);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (i!=list.size()-1)
               writter.write (list.get(i)+",");
            else   writter.write(list.get(i));

        }


        reader.close();
        writter.close();
            }
        }





