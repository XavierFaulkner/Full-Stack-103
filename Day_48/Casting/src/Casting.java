public class Casting {
    public static void main(String[] args) {
        double d =  112.35;
        int n = (int)d;
        System.out.println("Double: " + d);
        System.out.println("int: " + n);

        String s = "49";
        int n2 = Integer.parseInt(s);
        System.out.println("\nThe string value is: " + s);
        System.out.println("The integer value is: " + n2);
    }
}
