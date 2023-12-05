import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int count = 0;

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] != 1)
                count += primeNumber(arr[i]);
        }

        System.out.println(count);


    }
    static int primeNumber(int num) {
        for(int i=2; i<num; i++) {
            if(num % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}