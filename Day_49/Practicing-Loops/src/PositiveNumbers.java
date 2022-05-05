import java.util.Scanner;

public class PositiveNumbers {
    public void checkNum(Scanner in) {
        int num = 1;
        while(num != 0) {
            System.out.println("Enter a number:");
            num = in.nextInt();
            if(num < 0) {
                System.out.println("Number must be a positive number");
            } else if(num > 0){
                System.out.println("Number is " + num);
            }
        }
    }
}
