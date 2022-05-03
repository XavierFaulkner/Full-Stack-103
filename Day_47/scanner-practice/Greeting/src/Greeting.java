import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = in.nextLine();
        System.out.println("Hi " + name);
        in.close();
    }
}
