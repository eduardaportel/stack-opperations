import java.util.Stack;
public class Test3 {
    public static void main(String[] args) {
        Stack<String> Brand = new Stack<String>();

        Brand.push("Adidas");
        Brand.push("Nike");
        Brand.push("Supreme");

        System.out.println(Brand.search("Adidas"));

    }
}
