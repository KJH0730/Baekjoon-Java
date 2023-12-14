import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = 0;

        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<n; i++) {
            String str = scanner.nextLine();
            if(groupCheck(str)) cnt++;
        }

        System.out.println(cnt);
    }

    public static boolean groupCheck(String str) {
        char[] c = new char[str.length()];
        int addIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < c.length; j++) {
                if (addIndex !=0 && str.charAt(addIndex-1) != c[j] && str.charAt(i) == c[j]) {
                    return false;
                }
            }
            c[addIndex++] = str.charAt(i);
        }
        return true;
    }

}
