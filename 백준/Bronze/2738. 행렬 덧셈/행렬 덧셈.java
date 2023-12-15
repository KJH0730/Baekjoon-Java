import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[m][n];

        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr1[i].length; j++) {
                arr1[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr1[i].length; j++) {
                arr2[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr1[i].length; j++) {
                System.out.print((j == 0 ? "" : " ") + (arr1[i][j] + arr2[i][j]));
            }
            System.out.println();
        }
    }
}
