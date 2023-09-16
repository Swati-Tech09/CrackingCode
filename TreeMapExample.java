import java.util.TreeMap;
// Return in sorted
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> t= new TreeMap<>();

        int [] k = {10,9,88,4,0,12};
        for (int x:k)
        {
            t.put(x, x);
        }
      for(int a : t.keySet()) {
          System.out.print(a +" ");
      }
    }
}
