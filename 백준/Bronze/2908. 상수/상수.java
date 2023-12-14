import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");
        int a = sangsu(arr[0]);
        int b = sangsu(arr[1]);

        System.out.println(a > b ? a : b);

    }

    public static int sangsu(String str) {
        return Integer.parseInt(String.valueOf(str.charAt(2)) + String.valueOf(str.charAt(1)) + String.valueOf(str.charAt(0)));
    }
}
