import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String temp = String.valueOf(num);

        if(num > 10) {
            temp = "0" + temp;
        }

        int cnt = 0;

        while(true) {
            cnt++;

            int sum = (Integer.parseInt(temp)/10) + (Integer.parseInt(temp)%10);
            temp = String.valueOf(Integer.parseInt(temp)%10) + sum % 10;

            if(Integer.parseInt(temp) == num) {
                System.out.println(cnt);
                break;
            }
        }
    }
}
