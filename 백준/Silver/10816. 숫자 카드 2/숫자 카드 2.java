import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[20000001];

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++) {
            arr[Integer.parseInt(st.nextToken()) + 10000000]++;
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<m; i++) {
            int num = arr[Integer.parseInt(st.nextToken()) + 10000000];
            if(num != 0) {
                sb.append(num).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }

        sb.deleteCharAt(sb.length()-1);

        System.out.println(sb);
    }
}
