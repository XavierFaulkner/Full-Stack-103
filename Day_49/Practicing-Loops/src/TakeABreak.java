import java.util.Scanner;

public class TakeABreak {
    public void takeBreak(Scanner in) {
        String response = "";
        while(!response.equals("yes")) {
            System.out.println("Do you want to take a break? (Enter 'yes' to exit)");
            response = in.nextLine();
        }
    }
}
