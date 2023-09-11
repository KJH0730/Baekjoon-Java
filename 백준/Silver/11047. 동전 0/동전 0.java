import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N, K, result = 0;
    int[] coin;

    N = sc.nextInt();
    K = sc.nextInt();
    coin = new int[N];

    for (int i = 0; i < N; i++) {
      coin[i] = sc.nextInt();
    }

    for (int i = coin.length-1; i>-1; i--) {
      result += K / coin[i];
      K %= coin[i];
    }

    System.out.println(result);
  }
}