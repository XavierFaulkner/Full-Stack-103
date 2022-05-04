import java.util.Scanner;

public class BoilingWater {
    public void getWaterTemp() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number greater than 212: ");
        int waterTemp = in.nextInt();
        if(waterTemp > 212) {
            System.out.println("Water is boiling!");
        } else {
            System.out.println("Water is not boiling.");
        }
    }
}
