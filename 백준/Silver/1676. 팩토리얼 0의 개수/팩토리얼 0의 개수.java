import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        BigInteger value = new BigInteger("1");
        if(n != 0) {
            for(int i=n; i>0; i--) {
                value = value.multiply(BigInteger.valueOf(i));
            }

            String strValue = String.valueOf(value);

            int result = 0;
            for(int i=strValue.length()-1; i >= 0; i--) {
                if(strValue.charAt(i) == '0') {
                    result++;
                } else {
                    break;
                }
            }

            System.out.println(result);
        } else {
            System.out.println(0);
        }

    }
}