import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = {"","","ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        int sum = 0;

        String str = scanner.next();

        for(int i=0; i<str.length(); i++) {
            for(int j=2; j<arr.length; j++) {
                for(int k=0; k<arr[j].length(); k++) {
                    if(str.charAt(i) == arr[j].charAt(k))
                        sum += j + 1;
                }
            }
        }

        System.out.println(sum);
    }
}
