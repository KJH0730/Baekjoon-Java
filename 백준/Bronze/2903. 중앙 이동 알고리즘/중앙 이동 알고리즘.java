import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int count = 4;

        for(int i=0; i<n; i++) {
            count = (int)Math.pow(Math.sqrt(count) + (Math.sqrt(count) - 1), 2);
        }

        System.out.println(count);
    }
}
