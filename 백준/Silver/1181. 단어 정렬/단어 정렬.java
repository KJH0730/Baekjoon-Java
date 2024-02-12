import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for(int i=0; i<n; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, (str1, str2) -> {
            if(str1.length() == str2.length()) {
                for(int i=0; i<str1.length(); i++) {
                    if(str1.charAt(i) != str2.charAt(i))
                        return str1.charAt(i) - str2.charAt(i);
                }
                return 0;
            } else {
                return str1.length() - str2.length();
            }
        });

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(arr));

        String[] strArr = linkedHashSet.toArray(new String[] {});

        StringBuilder sb = new StringBuilder();

        for(int i=0; i< strArr.length; i++) {
            sb.append(strArr[i]).append("\n");
        }

        System.out.println(sb);
    }
}
