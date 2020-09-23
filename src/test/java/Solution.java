import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writter = new BufferedWriter(new FileWriter(args[1]));
        String s;
        String[] arrayStrings;
        while ((s = reader.readLine()) != null) {
            s = s.replaceAll("\\b\\w{1,6}\\b", "");
            s.trim();
            arrayStrings = s.split(" ");
            for (int i = 0; i < arrayStrings.length; i++) {
                if (i!=arrayStrings.length-1&&arrayStrings[i].length()>6)
                    writter .write(arrayStrings[i]+",");
                else if (i==arrayStrings.length-1&&arrayStrings[i].length()>6)
                    writter .write(arrayStrings[i]);
            }

                }
        reader.close();
        writter.close();
            }
        }





