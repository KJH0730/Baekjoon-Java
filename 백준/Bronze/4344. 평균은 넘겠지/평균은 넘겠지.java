import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int c = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<c; i++) {
            String[] str = scanner.nextLine().split(" ");
            int len = Integer.parseInt(str[0]);
            int sum = 0;
            float avg;

            for(int j=1; j<=len; j++) {
                sum += Integer.parseInt(str[j]);
            }

            avg = (float)sum / len;
            int highLevel = 0;

            for(int j=1; j<=len; j++) {
                if(Integer.parseInt(str[j]) > avg) highLevel++;
            }

            System.out.printf("%.3f%%%n", (float)highLevel / len * 100);
        }


    }
}