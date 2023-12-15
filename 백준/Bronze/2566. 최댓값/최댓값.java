import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[9][9];
        int max = Integer.MIN_VALUE;
        int m = -1;
        int n = -1;

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();

                if(arr[i][j] > max) {
                    max = arr[i][j];
                    m = i + 1;
                    n = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(m + " " + n);
    }
}
