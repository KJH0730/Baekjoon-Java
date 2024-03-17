import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] c = br.readLine().toCharArray();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<c.length; i++) {
            if(65 <= c[i] && c[i] <= 90) {
                char temp = (char)(c[i] + 13);
                sb.append(temp > 90 ? (char)(64+(temp % 90)) : temp);
            } else if(97 <= c[i] && c[i] <= 122) {
                char temp = (char)(c[i] + 13);
                sb.append(temp > 122 ? (char)(96+(temp % 122)) : temp);
            } else {
                sb.append(c[i]);
            }
        }

        System.out.println(sb);
    }
}