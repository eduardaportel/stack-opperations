import java.util.Stack;

public class Main {
    public static void main(String[] args) {

    // stack = LIFO data stucture
    // stores objects into a dort of "vertical tower"

    // creating a Stack that can store String
    Stack<String> stack = new Stack<String>(); // add a construtor()

    // push() to add to the top
    stack.push("Minecraft");
    stack.push("Valorant");
    stack.push("League of Legends");
    stack.push("Counter-Strike 2");

    // pop() to remove from the top
    stack.pop();

    // for loop
    for (int i = 0; i < 102902; i++){
        stack.push("Fallout76");
    }
    System.out.println(stack);

    }
}