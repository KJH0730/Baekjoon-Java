import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[Integer.parseInt(br.readLine())];

        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int range = (int)(arr.length * 0.15f + 0.5f);

        int sum = 0;
        for(int i=range; i<arr.length-range; i++) {
            sum += arr[i];
        }

        int avg = (int)(sum / ((arr.length - (range*2)) * 1.0f) + 0.5f);
        System.out.println(avg);
    }
}