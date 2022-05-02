public class MyNameIs {

    String fName;
    String lName;

    MyNameIs(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public void printName() {
        System.out.println("My name is");
        System.out.println(fName);
        System.out.println(lName);
    }
}