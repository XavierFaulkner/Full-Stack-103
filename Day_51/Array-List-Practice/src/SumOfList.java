import java.util.Scanner;
import java.util.ArrayList;

public class SumOfList {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> ints = new ArrayList<Integer>();
        int input = -1;
        System.out.println("Please enter your integers below. Enter 0 to stop:");
        while(input != 0) {
            try {
                input = Integer.parseInt(in.nextLine());
                ints.add(input);
            } catch(Exception e) {
                System.out.println("Please enter an integer.");
            }
        }
        int sum = 0;
        for(int i = 0; i < ints.size()-1; i++) {
            if(i < ints.size()-2) {
                System.out.print(ints.get(i) + ", ");
                sum += ints.get(i);
            } else {
                System.out.println(ints.get(i) + " were the items in the list. The sum of that list is:");
                sum += ints.get(i);
                System.out.println(sum);
            }
        }
        
        in.close();
    }
}
