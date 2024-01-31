import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        int len = line.length();

        int num = Integer.parseInt(line);
        int result = 0;

        for(int i= num - (len * 9); i<=num; i++) {
            int temp = i;
            int sum = 0;

            while(temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if(sum + i == num) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
