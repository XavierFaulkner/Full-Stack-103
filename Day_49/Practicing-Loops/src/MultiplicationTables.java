import java.util.Scanner;

public class MultiplicationTables {
    public void getNumber(Scanner in) {
        System.out.print("Input a number: ");
        int num = in.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}
