import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int num = scanner.nextInt();
            int[] arr = new int[num/2];
            int index = 0;
            int sum = 0;

            if(num == -1)
                break;

            for(int i=1; i<=num/2; i++) {
                if(num % i == 0) {
                    arr[index++] = i;
                    sum += i;
                }
            }

            if(sum == num) {
                System.out.print(num + " = ");
                for(int i=0; i<index; i++) {
                    System.out.print(i==0 ? arr[i] : " + " + arr[i]);
                }
                System.out.println();
            } else {
                System.out.println(num + " is NOT perfect.");
            }
        }
    }
}
