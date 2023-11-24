import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] str = scanner.nextLine().split(" ");
        int wordCount = 0;

        for(int i=0; i<str.length; i++) {
            if(!str[i].equals("")) {
                char ch = str[i].charAt(0);
                if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z'))
                    wordCount++;
            }
        }

        System.out.println(wordCount);

    }
}