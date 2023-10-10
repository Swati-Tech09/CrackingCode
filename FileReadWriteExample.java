import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWriteExample {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("Test.txt"));
        while(br.ready())
        {
            System.out.println(br.readLine());
        }

    }
}
