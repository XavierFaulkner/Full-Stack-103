public class Vacation {

    String city;
    String country;

    Vacation(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public void printVacation() {
        System.out.println("I'd like to visit");
        System.out.println(city);
        System.out.println(country);
    }

}
