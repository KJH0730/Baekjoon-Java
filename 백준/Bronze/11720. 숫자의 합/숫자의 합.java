import java.util.Scanner;             

class Main {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);

    int n;
    String s;
    int sum = 0;

    n = sc.nextInt();
    s = sc.next();
   
    for (int i=0; i<s.length(); i++) {
     sum += s.charAt(i) - '0';
    }
   
    System.out.println(sum);

   
  }
}