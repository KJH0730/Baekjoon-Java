import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C;

        A=sc.nextInt(); B=sc.nextInt(); C= sc.nextInt();

        if((A + (B + C) / 60) > 23) {
            A = (A + (B + C) / 60) - 24;
        } else
            A = A + (B + C) / 60;
        B = (B + C) % 60;

        System.out.println(A + " " + B);

        sc.close();
    }
}