import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        int i = 1;

        while(true) {
            if(String.valueOf(i).contains("666")) cnt++;
            if(cnt == n) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
