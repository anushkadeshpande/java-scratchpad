import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        // thread safe as it uses Vector under the hood
        // not much used
        // use ConcurrentLinkedDeque instead   --- thread safe and better at concurrency
        Stack<String> stack= new Stack<String>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        String s1 = stack.pop();
    }
}
