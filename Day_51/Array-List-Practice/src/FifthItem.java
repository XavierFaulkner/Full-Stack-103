import java.util.Scanner;
import java.util.ArrayList;

public class FifthItem {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String input = "e";
        System.out.println("Please enter your strings below. Enter an empty string to stop:");
        while(!input.equals("")) {
            input = in.nextLine();
            words.add(input);
        }
        try{
            System.out.println("The fifth item in the list is: " + words.get(4));
        } catch(Exception e) {
            System.out.println("There is no fifth item. Sorry.");
        }
        
        in.close();
    }
}