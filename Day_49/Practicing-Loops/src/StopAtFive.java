import java.util.Scanner;

public class StopAtFive {
    public void checkNum(Scanner in) {
        int response = 0;
        while(response != 5) {
            System.out.println("Give a number: ");
            response = Integer.parseInt(in.nextLine());
        }
    }
}
