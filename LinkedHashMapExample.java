import java.util.LinkedHashMap;
// Return insert sequence
public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> l = new LinkedHashMap();
        int [] arr ={10,9,88};
        for (int x: arr)
        {
            l.put(x,x);
        }

        for (int a :l.keySet())
        {
            System.out.println( a);
        }

    }
}
