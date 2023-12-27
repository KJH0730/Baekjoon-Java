import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        int[] arr = new int[31];
        int arrayIndex = 0;

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
