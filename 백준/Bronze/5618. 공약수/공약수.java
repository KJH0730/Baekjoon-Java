import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        ok(arr);
    }

    static int minNum(int[] arr) {
        int min = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(min > arr[i])
                min = arr[i];
        }

        return min;
    }

    static void ok(int[] arr) {
        int min = minNum(arr);
        int check = 0;

        for(int i=1; i<= min; i++) {
            for(int j=0; j<arr.length; j++) {
                if(arr[j] % i != 0)
                    break;
                else
                    check++;
            }

            if(check == arr.length)
                System.out.println(i);
            check = 0;
        }
    }

}