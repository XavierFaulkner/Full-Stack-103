import java.util.Scanner;

public class HelloThere {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello there! How are you doing today?");
        in.nextLine();
        System.out.println("Wow - Interesting! Tell me more about yourself");
        in.nextLine();
        System.out.println("Nice chatting with you! Goodbye!");
        in.close();
    }
}
