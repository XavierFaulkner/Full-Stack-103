import java.util.Scanner;

public class Superhero {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Let's write a story about a superhero.");
        System.out.println("Who is the hero of our story?");
        String hero = in.nextLine();
        System.out.println("What is their superpower?");
        String power = in.nextLine();
        System.out.println
        (
            "Here is the story\n" +
            "There once was a superhero named " + hero + ", who had the power of " + power + ". " +
            "As they grew older, " + hero + " saw that the world needed them. " +
            hero + " used their ability to " + power + " to save the world."
        );
        in.close();
    }
}
