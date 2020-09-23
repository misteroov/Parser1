import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("D:/1.txt"));
        String s;
        String[] arrayStrings;
        while ((s = reader.readLine()) != null) {
            s = s.replaceAll("\\b\\w{1,6}\\b", "");
            s.trim();
            arrayStrings = s.split(" ");
            for (int i = 0; i < arrayStrings.length; i++) {
                if (i!=arrayStrings.length-1&&arrayStrings[i].length()>6)
                    System.out.print(arrayStrings[i]+",");
                else if (i==arrayStrings.length-1&&arrayStrings[i].length()>6)
                System.out.print(arrayStrings[i]);
            }

                }
            }
        }





