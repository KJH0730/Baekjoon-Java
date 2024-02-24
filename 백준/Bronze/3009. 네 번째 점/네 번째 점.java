import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[3][3];

        for(int i=0; i<3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int xValue = arr[0][0];
        int yValue = arr[0][1];

        if(xValue == arr[1][0]) {
            xValue = arr[2][0];
        } else if(xValue == arr[2][0]) {
            xValue = arr[1][0];
        }

        if(yValue == arr[1][1]) {
            yValue = arr[2][1];
        } else if(yValue == arr[2][1]) {
            yValue = arr[1][1];
        }

        System.out.println(xValue + " " + yValue);
    }
}