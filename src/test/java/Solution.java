import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Solution {
    public static Map<String, String> runtimeStorage = new HashMap<>();


    public static void save(OutputStream outputStream) throws Exception {
        Properties p = new Properties();
        p.putAll(runtimeStorage);
        p.store(outputStream, null);
    }

    public static void load(InputStream inputStream) throws Exception {
        Properties p = new Properties();
        p.load(inputStream);
        runtimeStorage = new HashMap(p);
    }

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine())) {


                load(fos);
            }catch(Exception e){
                e.printStackTrace();
            }
            System.out.println(runtimeStorage);

        }
    }

