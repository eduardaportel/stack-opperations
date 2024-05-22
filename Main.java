import java.util.Stack;

public class Main {
    public static void main(String[] args) {

    // creating a Stack that can store String
    Stack<String> stack = new Stack<String>(); // add a construtor()

    // push : used to add
    stack.push("Minecraft");
    stack.push("Valorant");
    stack.push("League of Legends");

    // checking if the stack is empty
    // System.out.println(stack.empty());

    // assigning LOL to myFavGame
    String myFavGame = stack.pop();

    // print stack 
    System.out.println(stack);
    // print myFavGame
    System.out.println("My favorite game is: " + myFavGame);

    }
}