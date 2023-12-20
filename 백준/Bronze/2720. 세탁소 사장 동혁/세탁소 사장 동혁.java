import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] coinArr = {25, 10, 5, 1};

        for(int i=0; i<n; i++) {
            int c = scanner.nextInt();

            for(int j=0; j<coinArr.length; j++) {
                System.out.print(c / coinArr[j] + (j == 3 ? "" :" "));
                c = c % coinArr[j];
            }
            System.out.println();
        }
    }
}
