import java.util.HashMap;
// any order print
public class HashMapExample {

    public static void main(String[] args) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int [] arr={12,4,4,55,99,100};

        for(int x: arr)
        {
            h.put(x,x);
        }

        for(int a :h.keySet())
        {
            System.out.println(a);
        }
    }
}
