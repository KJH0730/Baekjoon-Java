import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[50];
        int arrayIndex = 0;
        for(int i=0; i<arr.length; i++) {
            arr[i] = -1;
        }

        while (n > 0) {
            arr[arrayIndex++] = n % b;
            n /= b;
        }

        for(int i=arrayIndex-1; i>=0; i--) {
            if(arr[i] > 9) {
                System.out.print((char)(arr[i] +  55));
            } else {
                System.out.print(arr[i]);
            }
        }
    }
}
