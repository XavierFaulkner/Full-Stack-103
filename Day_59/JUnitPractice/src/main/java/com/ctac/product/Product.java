package com.ctac.product;

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

    public String totalCost(int unitsPurchased) {
        this.unitsPurchased = unitsPurchased;
        if(quantity - unitsPurchased < 0) {
            return "\nSorry, we do not have enough product for this order.";
        } else {
            quantity -= unitsPurchased;
            return "Total cost is " + (cost*unitsPurchased);
        }
    }

    public String printProduct() {
        return "\n" + name + " costs $" + cost + " and " + unitsPurchased + " were purchased";
    }
}
