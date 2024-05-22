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
        
    // search for an object within the stack
    // the first item has position 1
    System.out.println(stack.search("Counter-Strike 2"));

    System.out.println(stack.search("Valorant"));

    // print stack
    System.out.println(stack);

    }
}