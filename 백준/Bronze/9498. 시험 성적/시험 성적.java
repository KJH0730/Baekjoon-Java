import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        char c;

        a=sc.nextInt();

        switch (a/10){
            case 10:
            case 9:
                c='A';
                break;
            case 8:
                c='B';
                break;
            case 7:
                c='C';
                break;
            case 6:
                c='D';
                break;
            default:
                c='F';
                break;
        }

        System.out.println(c);

        sc.close();

    }
}

