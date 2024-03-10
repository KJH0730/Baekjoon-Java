import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        StringTokenizer st;
        for(int i=0; i<3; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int cnt = 0;
            for(int j=0; j<4; j++) {
                if(Integer.parseInt(st.nextToken()) == 1) cnt++;
            }

            switch(cnt) {
                case 4:
                    sb.append("E").append('\n');
                    break;
                case 3:
                    sb.append("A").append('\n');
                    break;
                case 2:
                    sb.append("B").append('\n');
                    break;
                case 1:
                    sb.append("C").append('\n');
                    break;
                default:
                    sb.append("D").append('\n');
            }
        }
        System.out.print(sb);
    }
}