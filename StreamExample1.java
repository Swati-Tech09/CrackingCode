import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample1 {

    public static void main(String[] args) {
        Integer arr[] ={12,3,33,3,44,44,5,5};
        System.out.println(Arrays.stream(arr).distinct().collect(Collectors.toList()));

        System.out.println(Arrays.stream(arr).sorted().collect(Collectors.toList()));

        System.out.println(Arrays.stream(arr).map((Integer a)->a*a).collect(Collectors.toList()));

        Arrays.stream(arr).limit(5).forEach(System.out::println);
    }
}
