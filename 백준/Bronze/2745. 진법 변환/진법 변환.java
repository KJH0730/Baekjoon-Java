import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String n = input[0];
        int b = Integer.parseInt(input[1]);

        int digit = 0;
        int j = 0;
        for(int i=n.length()-1; i>=0; i--, j++) {
            if(Character.isAlphabetic(n.charAt(j))) {
                digit += (int) (Math.pow(b, i)) * (n.charAt(j) - 'A' + 10);
            } else
                digit += (int) (Math.pow(b, i)) * (n.charAt(j) - '0');
        }

        System.out.println(digit);
    }
}
