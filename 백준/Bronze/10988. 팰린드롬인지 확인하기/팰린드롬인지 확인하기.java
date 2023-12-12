import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        StringBuilder reverseWord = new StringBuilder(word);

        System.out.println(word.contentEquals(reverseWord.reverse()) ? 1 : 0);
    }
}
