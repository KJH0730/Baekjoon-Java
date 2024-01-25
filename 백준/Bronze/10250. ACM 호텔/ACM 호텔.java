import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            int floor = Integer.parseInt(st.nextToken());
            int room = Integer.parseInt(st.nextToken());
            int guest = Integer.parseInt(st.nextToken());

            int y = guest % floor == 0 ? floor : guest % floor;
            int x = guest % floor == 0 ? guest / floor : guest / floor + 1;

            String result = Integer.toString(y) + (x < 10 ? "0"+x : x );

            System.out.println(result);
        }
    }
}
