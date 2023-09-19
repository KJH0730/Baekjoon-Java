import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] t = new int[n];
    int sum = 0;
    int result = 0;
   
    for(int i=0; i<n; i++) {
      t[i] = sc.nextInt();    
    }

    Arrays.sort(t);
   
    for (int i=0; i<n; i++) {
      sum = 0;
      for (int j=0; j<i+1; j++) {
        sum += t[j];
      }
      result += sum;
    }

    System.out.println(result);
   
   
  }
}