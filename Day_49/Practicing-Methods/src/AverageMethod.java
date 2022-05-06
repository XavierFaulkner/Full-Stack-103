public class AverageMethod {
    public static void main(String[] args) {
        System.out.println(average());
    }

    public static double sum(double x, double y, double z) {
        return x+y+z;
    }

    public static String average() {
        return "The average is: " + (sum(3,5,7) /3);
    }
}
