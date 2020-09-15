import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) throws IOException {
        HashMap<String, Double> map = new HashMap<>();
        String s;

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        while ((s = reader.readLine()) != null&&!s.equals("")) {
            String[] array;
            Iterator<Map.Entry<String,Double>>  it;
            array = s.split(" ");
            String name = array[0];
            Double value = Double.valueOf(array[1]);
            Map.Entry<String,Double>            entry;
            it=map.entrySet().iterator();
            if (!map.isEmpty()) {
                while (it.hasNext()) {
                    entry = it.next();
                    if (name.equals(entry.getKey())){
                        double newValue = entry.getValue() + value;
                        entry.setValue(newValue);


                    }
                }
                if (!map.containsKey(name))
                    map.put(name,value);
            }else map.put(name,value);

        }
        reader.close();
        List<Double>list = new ArrayList<>(map.values());
        Collections.sort(list);
        for (Map.Entry<String,Double>entry:map.entrySet()){
            if (entry.getValue().equals(list.get(list.size()-1))){
                System.out.println(entry.getKey());
            }
        }
    }
}



