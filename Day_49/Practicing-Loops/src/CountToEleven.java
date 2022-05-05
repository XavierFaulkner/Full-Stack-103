import java.util.Scanner;

public class CountToEleven {
    public void startCounting(Scanner in) {
        System.out.print("Enter a number less than 11: ");
        int num = in.nextInt();
        for(int i = num; i <= 11; i++) {
            System.out.println(num);
            num++;
        }
    }
}
