import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        word = word.toUpperCase();

        char[] alphabet = {'A', 'B', 'C', 'D', 'E',
                            'F', 'G', 'H', 'I', 'J',
                            'K', 'L', 'M', 'N', 'O', 'P',
                            'Q', 'R', 'S', 'T', 'U', 'V',
                            'W', 'X', 'Y', 'Z'};

        int[] cnt = new int[alphabet.length];

        for(int i=0; i<word.length(); i++) {
            for(int j=0; j<alphabet.length; j++) {
                if( alphabet[j] == word.charAt(i) ) {
                    cnt[j]++;
                }
            }
        }

        int max = 0;
        char[] maxChar = new char[word.length()];
        int cIndex = 0;

        for(int i=0; i<cnt.length; i++) {
                if(cnt[i] > max) {
                    maxChar = new char[word.length()];
                    max = cnt[i];
                    cIndex = 0;
                    maxChar[cIndex++] = alphabet[i];
                } else if(cnt[i] != 0 && cnt[i] == max) {
                    maxChar[cIndex++] = alphabet[i];
                }
        }

        System.out.println(cIndex == 1 ? maxChar[0] : "?");

    }
}
