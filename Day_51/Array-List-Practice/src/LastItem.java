import java.util.Scanner;
import java.util.ArrayList;

public class LastItem {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String input = "e";
        System.out.println("Please enter your strings below. Enter an empty string to stop:");
        while(!input.equals("")) {
            input = in.nextLine();
            words.add(input);
        }
        if(words.size() > 1) {
            System.out.println("The last item in the list is: " + (words.get(words.size()-2)));
        } else {
            System.out.println("There are no items in this list. Sorry.");
        }
        
        in.close();
    }
}
