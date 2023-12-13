import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        int[] resultArr = new int[10];
        int cnt = 0;

        for(int i=0; i< arr.length; i++) {
            resultArr[i] = -1;
        }

        a:
        for(int i=0; i<10; i++) {
            arr[i] = scanner.nextInt() % 42;

            for(int j=0; j< resultArr.length; j++) {
                if(resultArr[j] == arr[i])
                    continue a;
            }

            resultArr[cnt++] = arr[i];
        }

        System.out.println(cnt);
    }
}
