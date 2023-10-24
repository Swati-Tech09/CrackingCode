import javax.print.attribute.IntegerSyntax;
import java.util.Arrays;
import java.util.List;

public class EvenStreamExample {

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(12,4,5,5,6,9,0);

        List<Integer> even = a.parallelStream().filter(k->k%2==0).toList();

        System.out.println("even numbers-" +even);
    }
}
