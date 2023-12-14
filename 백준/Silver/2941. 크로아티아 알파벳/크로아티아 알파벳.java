import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int cnt = 0;

        for(int i=0; i<str.length(); i++) {

            if(str.charAt(i) == 'c') {
                if(i < str.length()-1) {
                    if(str.charAt(i+1) == '=' || str.charAt(i+1) == '-') i++;

                }
            }

            if(str.charAt(i) == 'd') {
                if(i < str.length()-1) {
                    if(str.charAt(i+1) == '-')  {
                        i++;
                    } else if(str.charAt(i+1) == 'z') {
                        if(i < str.length()-2) {
                            if (str.charAt(i + 2) == '=') {
                                i += 2;
                            }
                        }
                    }
                }
            }

            if(str.charAt(i) == 'l' || str.charAt(i) == 'n') {
                if(i != str.length()-1) {
                    if(str.charAt(i+1) == 'j') i++;

                }
            }

            if(str.charAt(i) == 's' || str.charAt(i) == 'z') {
                if(i != str.length()-1) {
                    if(str.charAt(i+1) == '=') i++;

                }
            }

            cnt++;

        }
        System.out.println(cnt);
    }
}