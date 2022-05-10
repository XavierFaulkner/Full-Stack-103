import java.util.Scanner;
import java.util.ArrayList;

public class HowLarge {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String input = "e";
        System.out.println("Please enter your strings below. Enter an empty string to stop:");
        while(!input.equals("")) {
            input = in.nextLine();
            words.add(input);
        }
        System.out.println("The total amout of items in the list was: " + (words.size()-1));
        
        in.close();
    }
}
