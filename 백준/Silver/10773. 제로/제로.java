import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[Integer.parseInt(br.readLine())];

        int index = 0;
        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            int num = Integer.parseInt(br.readLine());

            if(num !=0) {
                sum += num;
                arr[index++] = num;
            } else {
                sum -= arr[--index];
                arr[index] = 0;
            }
        }

        System.out.println(sum);
    }
}
