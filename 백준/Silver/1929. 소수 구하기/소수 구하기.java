import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[] arr = new int[n+1];

        for(int i=0; i<=n; i++) {
            arr[i] = i+1;

        }

        if(arr[0] == 1)
            arr[0] = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) continue;
            if(arr[i] > Math.sqrt(n)) break;

            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] % arr[i] == 0)
                    arr[j] = 0;
            }
        }

        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0 && (m <= arr[i] && arr[i] <= n)) {
                System.out.println(arr[i]);
            }
        }
    }
}
