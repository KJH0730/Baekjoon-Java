import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {

            String str = br.readLine();
            char[] c = str.toCharArray();
            int openCnt = 0;
            boolean check = true;

            for (char a : c) {
                if (a == ')') {
                    if (openCnt > 0) {
                        openCnt--;
                    } else {
                        System.out.println("NO");
                        check = false;
                        break;
                    }
                } else {
                    openCnt++;
                }
            }

            if (check && openCnt == 0) {
                System.out.println("YES");
            } else if (check) {
                System.out.println("NO");
            } else if (openCnt != 0) {
                System.out.println("NO");
            }
        }

        br.close();
    }
}