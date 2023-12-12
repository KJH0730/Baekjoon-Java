import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        word = word.toUpperCase();

        int[] cnt = new int[26];

        for(int i=0; i<word.length(); i++) {
            cnt[word.charAt(i) - 'A']++;
        }

        int max = 0;
        char ch = ' ';

        for(int i=0; i<cnt.length; i++) {
            if(cnt[i] > max) {
                max = cnt[i];
                ch = (char)('A' + i);
            } else if(cnt[i] == max) {
                ch = '?';
            }
        }

        System.out.println(ch);
    }
}
