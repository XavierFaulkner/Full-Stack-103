import java.util.Scanner;

public class PracticingLoops {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Take a Break");
        TakeABreak b = new TakeABreak();
        b.takeBreak(in);

        System.out.println("Stop at Five");
        StopAtFive five = new StopAtFive();
        five.checkNum(in);

        System.out.println("Positive Numbers");
        PositiveNumbers n = new PositiveNumbers();
        n.checkNum(in);

        System.out.println("Count to Eleven");
        CountToEleven count = new CountToEleven();
        count.startCounting(in);

        System.out.println("Multiplication Tables");
        MultiplicationTables mult = new MultiplicationTables();
        mult.getNumber(in);
    }
}
