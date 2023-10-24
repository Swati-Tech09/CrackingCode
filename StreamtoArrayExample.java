import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamtoArrayExample {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(12,15,16,20,44);

         Set<Integer> a =l.stream().filter(s->s%2==0).collect(Collectors.toSet());
         a.forEach(System.out::println);


    }
}
