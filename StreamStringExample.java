import java.util.stream.Stream;

public class StreamStringExample {
    public static void main(String[] args) {

        Stream<String> s = Stream.of("AB%CD%DE".split("\\%"));
        s.forEach(p-> System.out.println(p));
    }
}
