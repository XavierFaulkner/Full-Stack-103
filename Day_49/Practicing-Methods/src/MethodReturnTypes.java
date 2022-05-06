public class MethodReturnTypes {

    public static void main(String[] args) {
        System.out.println(getString());
        System.out.println(getInt());
        System.out.println(getBool());
    }

    public static String getString() {
        return "This is a string";
    }

    public static int getInt() {
        return 5;
    }

    public static boolean getBool() {
        return true;
    }
}
