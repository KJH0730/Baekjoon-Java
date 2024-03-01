import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        String[] week = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int[] monthEnd = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int sum = 0;
        for(int i=0; i<month-1; i++) {
            sum += monthEnd[i];
        }
        sum += day;
        System.out.println(week[(sum -1) % 7]);
    }
}