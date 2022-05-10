public class OOP {
    public static void main(String[] args) throws Exception {
        BankAccount x = new BankAccount("Xavier", 500);
        x.deposit(100);
        System.out.println(x.toString());

        BankAccount j = new BankAccount("Joe", 5000);
        BankAccount z = new BankAccount("Zack", 300);

        j.withdrawal(100);
        z.deposit(100);

        System.out.println(j.toString());
        System.out.println(z.toString());

        Product gas = new Product("Gallon of gas", 4, 100);
        //calling printProdcut() from with totalCost to update variables in correct order
        gas.totalCost(100);

    }
}
