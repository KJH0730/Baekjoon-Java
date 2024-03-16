import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            StringBuilder temp = new StringBuilder();;
            while(st.hasMoreTokens()) {
                String str = st.nextToken();
                for(int j=str.length()-1; j>=0; j--) {
                    temp.append(str.charAt(j));
                }
                temp.append(" ");
            }
            temp.deleteCharAt(temp.length()-1);
            sb.append(temp).append('\n');
        }

        System.out.println(sb);
    }
}