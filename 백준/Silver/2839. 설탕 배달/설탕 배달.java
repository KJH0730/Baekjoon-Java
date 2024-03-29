import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
            int n = Integer.parseInt(br.readLine());
            
            int result = -1;
            int count5 = n / 5;

            if (n % 5 == 0) {
                result = count5;
            } else if ((n % 5) % 3 == 0) {
                result = count5 + (n % 5) / 3;
            } else if (count5 != 0) {
                while (count5 > 0) {
                    if ((n - (5 * count5)) % 3 == 0) {
                        result = count5 + (n - (5 * count5)) / 3;
                        break;
                    }
                    count5--;
                }
            }

            if (result == -1 && n % 5 != 0 && n % 3 == 0) {
                result = n / 3;
            }

            System.out.println(result);
    }
}