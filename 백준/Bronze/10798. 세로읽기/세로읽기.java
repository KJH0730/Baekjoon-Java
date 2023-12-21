import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] str = new String[5];
        char[][] word = new char[5][15];

        for(int i=0; i<5; i++) {
            str[i] = scanner.next();
            for(int j=0; j<str[i].length(); j++) {
                word[i][j] = str[i].charAt(j);
            }
        }

        for(int i=0; i<15; i++) {
            for(int j=0; j<5; j++) {
                if(word[j][i] != '\0') {
                    System.out.print(word[j][i]);
                }
            }
        }





    }
}
