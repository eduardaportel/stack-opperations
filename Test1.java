import java.util.Stack;
public class Test1 {
    public static void main(String[] args) {

        // creating a new Stack that store Integer number
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(5);
        stack.push(3);
        stack.pop();
        stack.push(2);
        stack.push(8);
        stack.pop();

        System.out.println(stack);

    }
    
}
