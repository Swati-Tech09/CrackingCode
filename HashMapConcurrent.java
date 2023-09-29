import java.util.HashMap;
import java.util.Map;

public class HashMapConcurrent {
    public static void main(String[] args) {
        HashMap<String,Long> phoneBook = new HashMap<>();
        phoneBook.put("Swati",782222288L);
        phoneBook.put("Sinha",732222288L);
        phoneBook.put("XYZ",792222288L);

        for(String key:phoneBook.keySet())
        {
            System.out.println(key);
        }

        for(Map.Entry<String, Long> m: phoneBook.entrySet())
        {
            //System.out.println(m.getKey());
            //System.out.println(m.getValue());
           // phoneBook.put("NN",8887777L);
            if(m.getKey().contains("Swati"))
            {
                m.setValue(8778778L);
            }

        }
        System.out.println(phoneBook);



    }
}
