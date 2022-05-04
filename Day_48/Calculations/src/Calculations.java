import java.util.Arrays;
import java.util.Scanner;

public class Calculations {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int first = in.nextInt();
        System.out.println("Enter another number: ");
        int second = in.nextInt();
        System.out.println(first + " + " + second + " = " + (first + second));
        System.out.println(first + " - " + second + " = " + (first - second));
        System.out.println(first + " * " + second + " = " + (first * second));
        System.out.println(first + " / " + second + " = " + ((double) first / (double) second));
        System.out.println(first + " % " + second + " = " + (first % second));
    }

}
