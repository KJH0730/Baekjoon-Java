import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String[] str = br.readLine().split(" ");
        long a = Long.parseLong(str[0]);
        long b = Long.parseLong(str[1]);

        long gcd = gcd(b, a);

        System.out.println(gcd * (a/gcd) * (b/gcd));
    }

    static long gcd(long a, long b) {
        long r = a % b;

        if(r == 0) {
            return b;
        }
        else {
            return gcd(b, r);
        }
    }
}
