public class Printing {
    public static void main(String[] args) throws Exception {
        String firstName = "Xavier";
        String lastName = "Faulkner";
        String vacationCity = "Tokyo";
        String vacationCountry = "Japan";
        String name = firstName + " " + lastName;
        MyNameIs person = new MyNameIs(firstName, lastName);
        Vacation vacation = new Vacation(vacationCity, vacationCountry);
        HiFriend friend = new HiFriend(name);
        person.printName();
        vacation.printVacation();
        friend.sayHi();
    }
}