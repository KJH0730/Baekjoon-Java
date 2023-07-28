import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H, M;
        H = sc.nextInt(); M = sc.nextInt();

        if(M < 45) {
            if((H-1) < 0) {
                H = 23;
                M = 15 + M;
            }
            else {
                H = H - 1;
                M = 15 + M;
            }
        }
        else {
            M = M - 45;
        }

        System.out.println(H + " " + M);

    }
}

