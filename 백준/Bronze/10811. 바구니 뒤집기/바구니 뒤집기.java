import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n+1];

        for(int i=1; i< arr.length; i++) {
            arr[i] = i;
        }

        for(int i=0; i<m; i++) {
            int left = scanner.nextInt();
            int right = scanner.nextInt();

            int j = left;
            int k = right;

            if((k - j) % 2 == 0) {
                for (; j < (left + right) / 2 && k > (left + right) / 2; j++, k--) {
                    int tmp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = tmp;
                }
            } else {
                for (; j <= (left + right) / 2 && k > (left + right) / 2; j++, k--) {
                    int tmp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = tmp;
                }
            }


        }

        for(int i=1; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
