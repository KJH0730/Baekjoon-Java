import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int j=1;;j++) {

                if(a == 1) {
                    System.out.println(b);
                    break;
                }

                if((b*j) % a == 0) {
                    System.out.println(b*j);
                    break;
                }


            }
        }
    }
}
