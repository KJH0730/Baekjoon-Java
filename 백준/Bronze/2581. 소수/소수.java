import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int primeCount = 0;
        int min = 0;
        int sum = 0;

        for(int i=m; i<=n; i++) {
            if(primeNumber(i)) {
                primeCount++;
                if(primeCount == 1)
                    min = i;
                sum += i;
            }
        }

        if(primeCount == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }

    }

    static boolean primeNumber(int num) {
        if(num == 1) return false;
        
        for(int i=2; i<num; i++) {
            if(num % i == 0)
                return false;
        }


        return true;
    }

}