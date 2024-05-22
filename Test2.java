import java.util.Stack;
public class Test2 {
    public static void main(String[] args) {
        // 3 stacks
        Stack<Integer> n1 = new Stack<Integer>();
        Stack<Integer> n2 = new Stack<Integer>();
        Stack<Integer> n3 = new Stack<Integer>();

        // n2 with 10 elements
        for(int i = 0; i < 10; i++){
            n2.push(i);
            n3.push(n2.pop());
        }

        // n1 with 19 elements
        for(int i = 0; i< 20; i++){
            n1.push(i);
            n3.push(n1.pop());
        }

        // n3 = n1 + n2 
        System.out.println(n3);
    }
}
