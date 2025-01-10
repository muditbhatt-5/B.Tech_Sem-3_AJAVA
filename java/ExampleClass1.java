import java.util.Stack;

public class ExampleClass1 {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Item 1");
        stack.push("Item 2");
        stack.push("Item 3");
        stack.push("Item 4");
        stack.push("Item 5");

        System.out.println("Topmost Element of the stack: " + stack.peek());

        stack.pop();

        System.out.println("After popping one item:");
        System.out.println("Topmost Element of the stack: " + stack.peek());
    }
}