import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line1 = br.readLine();
        StringTokenizer st = new StringTokenizer(line1);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String line2 = br.readLine();
        st = new StringTokenizer(line2);

        int[] arr = new int[n];
        int index=0;

        while(st.hasMoreTokens()) {
            arr[index++] = Integer.parseInt(st.nextToken());
        }

        int len = arr.length;
        int max = 0;

        for(int i=0; i<len-2; i++) {
            for(int j=i+1; j<len-1; j++) {
                for(int k= j+1; k<len; k++) {
                    int sum = arr[i] + arr[j] + arr[k];

                    if(sum <= m && sum > max) {
                        max = sum;
                    }
                }
            }
        }

        System.out.println(max);

    }
}
