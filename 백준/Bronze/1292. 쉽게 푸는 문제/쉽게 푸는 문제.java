import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int cnt = 0;
        int sum = 0;
        for(int i=1; i<=1000; i++) {
            for(int j=0; j<i; j++) {
                cnt++;

                if(a <= cnt && cnt <= b) {
                    sum += i;
                } else if(cnt > b) {
                    System.out.println(sum);
                    return;
                }
            }
        }
    }
}