public class Product {
    double cost;
    int quantity;
    String name;
    int unitsPurchased = 0;

    public Product(String productName, double cost, int quantity) {
        name = productName;
        this.cost = cost;
        this.quantity = quantity;
    }

    public void totalCost(int unitsPurchased) {
        this.unitsPurchased = unitsPurchased;
        if(quantity - unitsPurchased < 0) {
            System.out.println("\nSorry, we do not have enough product for this order.");
        } else {
            quantity -= unitsPurchased;
            printProduct();
            System.out.println("Total cost is " + (cost*unitsPurchased));
        }
    }

    public void printProduct() {
        System.out.println("\n" + name + " costs $" + cost + " and " + unitsPurchased + " were purchased");
    }
}
