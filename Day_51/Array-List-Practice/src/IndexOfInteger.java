import java.util.Scanner;
import java.util.ArrayList;

public class IndexOfInteger {
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
        System.out.println("Done entering integers into the list.");
        System.out.println("What number are you looking for in the list?");
        int num = Integer.parseInt(in.nextLine());
        for(int i = 0; i < ints.size(); i++) {
            if(num == ints.get(i)) {
                System.out.println(num + " is at index " + i);
            }
        }
        
        in.close();
    }
}
