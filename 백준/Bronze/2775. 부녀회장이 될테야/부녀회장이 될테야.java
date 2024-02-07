import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int result = solve(k, n);

            System.out.println(result);
        }

    }
    static int solve(int k, int n) {

        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = i+1;
        }

        for(int i=1; i<k; i++) {
            int sum = 1;
            for(int j=1; j<n; j++) {
                int temp = arr[j];
                arr[j] = sum + temp;
                sum += temp;
            }
        }

        int value = 0;

        for(int i=0; i<arr.length; i++) {
            value += arr[i];
        }

        return value;
    }
}
