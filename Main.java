import java.util.Stack;

public class Main {
    public static void main(String[] args) {

    // creating a Stack that can store String
    Stack<String> stack = new Stack<String>(); // add a construtor()

    // push : used to add
    stack.push("Minecraft");
    stack.push("Valorant");
    stack.push("League of Legends");

    // peek method shows me the LIFO item 
    // serve just to take a look, don't remove
    System.out.println(stack.peek());

    // print stack 
    System.out.println(stack);

    }
}