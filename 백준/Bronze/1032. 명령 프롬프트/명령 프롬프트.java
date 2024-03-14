import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] strs = new String[n];
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++) {
            strs[i] = br.readLine();
        }

        if(n == 1) {
            System.out.println(strs[0]);
        } else {
            char c;
            for(int i=0; i<strs[0].length(); i++) {
                c = strs[0].charAt(i);
                for(int j=1; j<n; j++) {
                    if(c != strs[j].charAt(i)) {
                        c = '?';
                    }
                }
                sb.append(c);
            }
            System.out.println(sb);
        }
    }
}