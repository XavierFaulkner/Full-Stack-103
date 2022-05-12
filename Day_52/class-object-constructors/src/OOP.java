public class OOP {
    public static void main(String[] args) throws Exception {
        Product gas = new Product("Gallon of gas", 4, 100);
        //calling printProdcut() from with totalCost to update variables in correct order
        gas.totalCost(100);
    }
}
