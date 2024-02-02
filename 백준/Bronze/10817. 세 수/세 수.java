import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int middle = 0;

        if(a >= b && a <= c) {
            middle = a;
        } else if(a >= c && a <= b) {
            middle = a;
        } else if(b >= a && b <= c) {
            middle = b;
        } else if(b >= c && b <= a) {
            middle = b;
        } else if(c >= a && c <= b) {
            middle = c;
        } else if(c >= b && c <= a) {
            middle = c;
        }

        System.out.println(middle);
    }
}
