import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class FrequencyOfString {
    public static void main(String[] args) {
        int [] arr ={2,3,4,5,4,7};

        System.out.println(stream(arr).distinct().count());
    }
}
