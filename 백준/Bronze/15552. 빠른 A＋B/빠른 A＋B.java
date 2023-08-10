import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String s;
        int a, b, n;

        n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            s = br.readLine();
            st = new StringTokenizer(s);
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            bw.write(a+b + "\n" );

        }
        bw.flush();
        bw.close();

    }
}
