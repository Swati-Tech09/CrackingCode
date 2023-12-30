public class ReverseString {

    public static void main(String[] args) {
        String str ="hello";

        char [] chr = str.toCharArray(); // Put it in a character

        for (int i =chr.length-1; i>=0; i--) {  // hello is 5 length, it prints till 0 index
            System.out.print(chr[i]);
        }
    }
}
