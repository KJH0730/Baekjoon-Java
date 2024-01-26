import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        BigInteger sum = new BigInteger("0");

        for(int i=0; i<n; i++) {
            sum = sum.add(BigInteger.valueOf(input.charAt(i) - 96L).multiply(BigInteger.valueOf(31).pow(i)));
        }
        System.out.println(sum.remainder(BigInteger.valueOf(1234567891)));
    }
}