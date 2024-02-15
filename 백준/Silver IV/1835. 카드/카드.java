import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] result = new int[n+1];
        Queue<Integer> q = new LinkedList<>();

        for(int i=1; i<=n; i++) {
            q.offer(i);
        }

        for(int i=1; i<n; i++) {
            for(int j=0; j<i; j++) {
                q.offer(q.poll());
            }
            result[q.poll()] = i;
        }

        result[q.poll()] = n;

        StringBuilder sb = new StringBuilder();
        for(int i=1; i< result.length; i++) {
            sb.append(result[i]);

            if(i != result.length-1) {
                sb.append(" ");
            }
        }

        System.out.println(sb);

    }
}
