import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while(true) {
            String str = br.readLine();

            if(str.equals(".")) break;

            int smallLeft = 0;
            int smallRight = 0;
            int bigLeft = 0;
            int bigRight = 0;
            Stack<Character> stack = new Stack<>();

            for(int i=0; i<str.length(); i++) {
                switch (str.charAt(i)) {
                    case '(':
                        smallLeft++;
                        stack.push('(');
                        break;
                    case ')':
                        smallRight++;
                        if(smallRight > smallLeft || stack.pop() != '(') {
                            i = str.length();
                        }
                        break;
                    case '[':
                        bigLeft++;
                        stack.push('[');
                        break;
                    case ']':
                        bigRight++;
                        if(bigRight > bigLeft || stack.pop() != '[') {
                            i = str.length();
                        }
                        break;
                }
            }

            if(smallLeft == smallRight && bigLeft == bigRight) {
                sb.append("yes").append('\n');
            } else {
                sb.append("no").append('\n');
            }
        }

        System.out.println(sb);
    }
}