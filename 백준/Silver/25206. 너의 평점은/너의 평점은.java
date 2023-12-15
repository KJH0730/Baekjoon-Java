import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] scoreAlpha = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        float[] scores = {4.5f, 4.0f, 3.5f, 3.0f, 2.5f, 2.0f, 1.5f, 1.0f, 0.0f};

        float gradeSum = 0;
        float majorSum = 0;

        for(int i=0; i<20; i++) {
            String[] str = scanner.nextLine().split(" ");
            float grade = Float.parseFloat(str[1]);
            String alpha = str[2];
            float score = 0;

            for(int j=0; j<scoreAlpha.length; j++) {
                if(alpha.equals(scoreAlpha[j])) {
                    score = scores[j];
                }
            }

            if(!alpha.equals("P")) {
                majorSum += grade;
                gradeSum += grade * score;
            }
        }
        float avg = (float)((int)((gradeSum / majorSum) * 1000000 + 0.5f))/1000000;
        System.out.printf("%.6f",avg);
    }
}
