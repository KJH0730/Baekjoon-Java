import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[9];

        int max = Integer.MIN_VALUE;
        int maxIndex = -1;

        for(int i=0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();

            if(arr[i] > max) {
                max = arr[i];
                maxIndex = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(maxIndex);



    }
}
