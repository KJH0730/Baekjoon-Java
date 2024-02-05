import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int num = Integer.parseInt(br.readLine());

            if(num == 0) {
                break;
            }

            int result = 0;
            int temp = num;

            while(temp != 0) {
                result = result * 10 + temp % 10;
                temp /= 10;
            }

            if(num == result) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
