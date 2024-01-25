import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

         int a = Integer.parseInt(br.readLine());
         int b = Integer.parseInt(br.readLine());
         int c = Integer.parseInt(br.readLine());

         int cal = a * b * c;

         int[] numArr = new int[10];

         while( cal > 0 ) {
             numArr[cal % 10]++;
             cal /= 10;
         }

         for(int i=0; i< numArr.length; i++) {
             System.out.println(numArr[i]);
         }
    }
}
