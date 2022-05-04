import java.util.Scanner;

public class NumberComparison {
    public void compareNums() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = in.nextInt();
        System.out.println("Enter another number:");
        int num2 = in.nextInt();
        if(num1 == num2) {
            System.out.println("Numbers are the same");
        } else if(num1 > num2) {
            System.out.println("The first number was larger than the second.");
        } else {
            System.out.println("The second number was larger than the first.");
        }
    }
}
