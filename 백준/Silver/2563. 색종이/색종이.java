import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        boolean[][] arr = new boolean[101][101];

        int sum = 0;

        for(int i=0; i<n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            for(int j=a; j<a+10; j++) {
                for(int k=b; k<b+10; k++) {
                    arr[j][k] = true;
                }
            }
        }

        for(int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j])
                    sum++;
            }
        }

        System.out.println(sum);


    }
}
