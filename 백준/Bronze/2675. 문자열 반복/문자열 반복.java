import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.nextLine();

        for(int i=0; i<n; i++) {
            String[] str = scanner.nextLine().split(" ");
            int iter = Integer.parseInt(str[0]);
            String s = str[1];

            for(int j=0; j<s.length(); j++) {
                for(int k=0; k<iter; k++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
