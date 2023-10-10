import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapStreamExample {
    public static void main(String[] args) {

        Stream<String> nameStream= Stream.of("Hello","hi","EveryBody");
 //       System.out.println(nameStream.filter((String name) -> name.length()<=5).collect(Collectors.toList()));

        System.out.println(nameStream.map((String name) -> name.toLowerCase()).collect(Collectors.toList()));

    }
}

