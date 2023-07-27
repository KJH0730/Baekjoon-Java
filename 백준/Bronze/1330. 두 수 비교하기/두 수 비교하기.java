import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        String s;

        a=sc.nextInt(); b=sc.nextInt();

        if(a>b)
            s = ">";
        else if(a<b)
            s = "<";
        else
            s = "==";

        System.out.println(s);

        sc.close();

    }
}

