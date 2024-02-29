import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        for(int i=0; i<9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;
        int[] result = new int[7];
        int index = 0;

        root:
        for(int i=0; i<8; i++) {
            for(int j=i+1; j<9; j++) {
                for(int k=0; k<9; k++) {
                    if(k != i && k != j) {
                        result[index++] = arr[k];
                        sum += arr[k];
                    }
                }

                if(sum == 100) {
                    break root;
                }

                result = new int[7];
                index = 0;
                sum = 0;
            }
        }

        Arrays.sort(result);

        for(int i=0; i<7; i++) {
            System.out.println(result[i]);
        }
    }
}