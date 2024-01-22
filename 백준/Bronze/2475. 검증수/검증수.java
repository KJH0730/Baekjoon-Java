import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        int a = (int)Math.pow(Integer.parseInt(st.nextToken()), 2);
        int b = (int)Math.pow(Integer.parseInt(st.nextToken()), 2);
        int c = (int)Math.pow(Integer.parseInt(st.nextToken()), 2);
        int d = (int)Math.pow(Integer.parseInt(st.nextToken()), 2);
        int e = (int)Math.pow(Integer.parseInt(st.nextToken()), 2);

        int sum = a + b + c + d + e;
        int result = sum % 10;

        System.out.println(result);
    }
}
