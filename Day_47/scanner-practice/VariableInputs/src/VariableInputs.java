import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string of text: ");
        String text = s.nextLine();
        System.out.println("Enter an integer: ");
        int integer = s.nextInt();
        System.out.println("Enter a double: ");
        double d = s.nextDouble();
        System.out.println("Enter a boolean value");
        boolean b = s.nextBoolean();
        System.out.println("Your string is " + text);
        System.out.println("Your integer is " + integer);
        System.out.println("Your double is " + d);
        System.out.println("Your boolean is " + b);
        s.close();
    }
}
