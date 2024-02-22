import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i=n; i>0; i--) {
            for(int j=n-i; j>0; j--) {
                sb.append(" ");
            }

            for(int k=0; k<i; k++) {
                sb.append("*");
            }
            sb.append('\n');
        }

        sb.deleteCharAt(sb.length()-1);

        System.out.print(sb);
    }
}