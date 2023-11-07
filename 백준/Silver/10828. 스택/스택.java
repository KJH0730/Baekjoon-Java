import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    static ArrayList<Integer> stack = new ArrayList<>();
    static int top = -1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");

            if (command[0].equals("push")) {
                push(Integer.parseInt(command[1]));
            } else if (command[0].equals("pop")) {
                System.out.println(pop());
            } else if (command[0].equals("size")) {
                System.out.println(size());
            } else if (command[0].equals("empty")) {
                System.out.println(empty());
            } else if (command[0].equals("top")) {
                System.out.println(top());
            }
        }

    }

    public static void push(int data) {
        stack.add(data);
        top++;
    }

    public static int pop() {
        if (!stack.isEmpty()) {
            int topNum = stack.get(top);

            stack.remove(top);
            top--;

            return topNum;
        } else {
            return -1;
        }
    }

    public static int size() {
        return stack.size();
    }

    public static int empty() {
        if (!stack.isEmpty()) {
            return 0;
        } else return 1;
    }

    public static int top() {
        if (!stack.isEmpty()) {
            return stack.get(top);
        } else {
            return -1;
        }
    }
}