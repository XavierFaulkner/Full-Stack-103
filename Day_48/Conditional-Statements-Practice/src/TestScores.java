import java.util.Scanner;

public class TestScores {
    public void getGrade() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 100");
        int grade = in.nextInt();
        String letterGrade;
        if (grade >= 90) {
            letterGrade = "A :)";
        } else if(grade >= 80) {
            letterGrade = "B :)";
        } else if(grade >= 70 ) {
            letterGrade = "C :|";
        } else if(grade >= 60) {
            letterGrade = "D :(";
        } else {
            letterGrade = "F :(";
        }
        System.out.println("Your grade is a(n) " + letterGrade);
    }
}