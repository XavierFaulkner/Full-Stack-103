import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ChatBot {
    static Scanner in = new Scanner(System.in);
    static String name;
    static int age;
    static LocalDate birthday;
    public static void main(String[] args) throws Exception {
        greatUser();
        confirmName();
        guessAge();
        count();
        quiz();
        story();
        dayOfWeek();
        goodbye();
    }

    public static void greatUser() {
        System.out.print("Hey, I'm your friendly neighboorhood chat bot. What's your name?: ");
        name = in.nextLine();
    }

    public static void confirmName() {
        System.out.print("\nJust to make sure I got it right, can you repeat your name one more time please?: ");
        name = in.nextLine();
        System.out.println("\nGreat! Nice to meet you " + name + ".");
    }

    public static void guessAge() {
        System.out.print("\nLet me guess your age. What is your birthday? (mm/dd/yy): ");
        String bday = in.nextLine();
        boolean incorrectInput = true;
        while(incorrectInput) {
            try{
                birthday = LocalDate.parse(bday, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
                incorrectInput = false;
            }
            catch(Exception e) {
                System.out.print("\nSorry, I didn't understand. Please enter the date in the format (mm/dd/yyyy): ");
                bday = in.nextLine();
            }
        }
        age = Period.between(birthday, LocalDate.now()).getYears();
        System.out.println("\nAccording to my calculations, you are " + age + " years old.");
    }

    public static void count() {
        System.out.print("\nWant to see me count? Give me any integer to count to: ");
        int num;
        try {
            num = Integer.parseInt(in.nextLine());
        } catch(Exception e) {
            System.out.print("\nSorry, I didn't understand. Please enter a valid integer: ");
            num = Integer.parseInt(in.nextLine());
        }
        if(num > 0) {
            for(int i = 1; i <= num; i++) {
                System.out.println(i);
            }
        } else if(num < 0) {
            for(int i = -1; i >= num; i--) {
                System.out.println(i);
            }
        }
    }

    public static void quiz() {
        System.out.print(
            "\nTime to test your programming knowledge!" +
            "\nIf a variable is declared as private, where may the variable be accessed?" +
            "\n(a) A private variable may only be accessed within the class in which it is declared." + 
            "\n(b) A private variable may be accessed outside the class in which it is declared." + 
            "\n(c) A private variable may be changed outside the class in which it is declared." +
            "\n(d) A private variable may be accessed by another class in which it wasn't declared." +
            "\nYour answer: "
            );
        String answer = in.nextLine();
        while(!answer.equalsIgnoreCase("a")) {
            System.out.print("\nSorry that was incorrect. Please try another answer: ");
            answer = in.nextLine();
        }
        System.out.println("\nYou got it! Looks like you really know your stuff.");
    }

    public static void story() {
        System.out.println(
            "\nHere is a short story about you.\n" +
            name + " was born " + age + " years ago on " + birthday.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL))
            );
    }

    public static void dayOfWeek() {
        int day = 0;
        System.out.print(
            "\nLet me tell you what I think about a day of the week." +
            "\nPick a number 1-7: "
            );
        while(day < 1 || day  > 7) {
            try {
                day = Integer.parseInt(in.nextLine());
                if(day < 1 || day > 7) {
                    System.out.print("\nPlease pick an integer from 1 to 7: ");
                }
            } catch(Exception e) {
                System.out.print("\nSorry, I didn't understand. Please pick an integer from 1 to 7: ");
            }
        }

        switch(day) {
            case 1:
                System.out.println("On Mondays, I meet up with my bowling team.");
                break;
            case 2:
                System.out.println("Everyone loves taco Tuesday.");
                break;
            case 3:
                System.out.println("Wednesday is my favorite day of the week.");
                break;
            case 4:
                System.out.println("I find it hard to focus on Thursdays.");
                break;
            case 5:
                System.out.println("Friday is my second favorite day of the week.");
                break;
            case 6:
                System.out.println("On Saturdays, I meet with my book club.");
                break;
            case 7:
                System.out.println("On Sundays, I don't exist.");
                break;
        }
    }

    public static void goodbye() {
        System.out.println("\nGoodbye, it was very nice talking with you.");
    }

}
