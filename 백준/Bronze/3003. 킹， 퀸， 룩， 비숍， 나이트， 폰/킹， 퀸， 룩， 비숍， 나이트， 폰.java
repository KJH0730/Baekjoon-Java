import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,1,2,2,2,8};
        int[] ans = new int[arr.length];

        for(int i=0; i<ans.length; i++) {
            ans[i] = scanner.nextInt();
        }

        for(int i=0; i<ans.length; i++) {
            System.out.print(arr[i] - ans[i] + " ");
        }
    }
}
