import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            String line = br.readLine();
            int result = 0;
            int cal = 0;

            for(int j=0; j<line.length(); j++) {
                if(line.charAt(j) == 'O') {
                    result += ++cal;
                } else if(line.charAt(j) == 'X') {
                    cal = 0;
                }
            }

            System.out.println(result);
        }
    }

}
