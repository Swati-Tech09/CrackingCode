import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ListStreamExample {

    public static void main(String[] args) {
        List<Integer> k  = new ArrayList<>();

        for(int i =0;i<=20;i++)
        {
            k.add(i);
        }

        Stream<Integer> s = k.stream();
        s.forEach(p-> System.out.println(p));

    }
}
