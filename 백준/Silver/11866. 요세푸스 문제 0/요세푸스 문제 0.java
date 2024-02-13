import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        int[] result = new int[n];
        int rIndex = 0;

        for(int i=1; i<arr.length; i++) {
            arr[i] = i;
        }
        int i=1;
        while(n != 0) {
            int kill = 0;

            while(kill != k) {
                if(arr[i%(arr.length)] != 0) {
                    kill++;
                }
                i++;
            }
            result[rIndex++] = arr[(i-1)%(arr.length)];
            arr[(i-1)%(arr.length)] = 0;
            n--;
        }

        StringBuilder sb = new StringBuilder();
        sb.append('<');

        for(int j=0; j<result.length; j++) {
            if(j != result.length-1) {
                sb.append(result[j]).append(", ");
            } else {
                sb.append(result[j]);
            }
        }
        sb.append('>');

        System.out.println(sb);
    }
}
