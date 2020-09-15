import java.io.*;
import java.util.*;
public class Solution {
    public static   Map<Integer, String> map = new HashMap<>();
    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }
    public static void main(String[] args) throws IOException {
//        Scanner scan = new Scanner(System.in);
//        String fileName = scan.nextLine();
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String s;

        while ((s=reader.readLine())!=null) {
            String[] array = s.split(" ");
            for (int i = 0; i < array.length; i++) {
                try {
                    int x = Integer.parseInt(array[i]);
                    if (x>=0&&x<=12) {
                        String newValue = map.get(x);
                        array[i] = newValue;
                    }
                } catch (NumberFormatException w) {

                }
            }

            for (String xx:array){
                System.out.print(xx+" ");
            }

        } reader.close();
    }
}



