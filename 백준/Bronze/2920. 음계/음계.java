import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        StringTokenizer st = new StringTokenizer(line);
        StringBuilder sb = new StringBuilder();

        while(st.hasMoreTokens()) {
            sb.append(st.nextToken());
        }

        int val = Integer.parseInt(sb.toString());

        if(val == 12345678) {
            System.out.println("ascending");
        } else if(val == 87654321) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
