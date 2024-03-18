import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        if(str.length() % 3 == 1) {
            str = "00" + str;
        } else if(str.length() % 3 == 2) {
            str = "0" + str;
        }
        StringBuilder sb = new StringBuilder(str);

        char[] values = sb.toString().toCharArray();

        sb = new StringBuilder();

        for(int i=0; i<values.length-2; i+=3) {
            int sum = 0;

            if(values[i] - '0' == 1) sum += 4;
            if(values[i+1] - '0' == 1) sum += 2;
            if(values[i+2] - '0' == 1) sum += 1;

            sb.append(sum);
        }

        System.out.println(sb);
    }
}