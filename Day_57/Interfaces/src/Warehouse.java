import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    Map<String, Integer> prices;
    Map<String, Integer> stock;

    public  Warehouse() {
        prices = new HashMap<>();
        stock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        //which adds a product to the warehouse with the price
        // and stock balance given as parameters.
        prices.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        //which returns the price of the product it received as
        // a parameter. If the product hasn't been added to the
        // warehouse, the method must return -99.
        if(prices.get(product) == null) {
            return -99;
        } else {
            return prices.get(product);
        }
    }

    public int stock(String product) {
        //returns the current remaining stock of the product in the
        // warehouse. If the product hasn't been added to the warehouse,
        // the method must return 0.
        if(stock.get(product) == null) {
            return 0;
        } else {
            return stock.get(product);
        }
    }

    public boolean take(String product) {
        //reduces the stock remaining for the product it received as a
        // parameter by one, and returns true if there was stock remaining.
        // If the product was not available in the warehouse the method
        // returns false. A products stock can't go below zero.
        if(stock.get(product) == null || stock.get(product) == 0) {
            return false;
        } else {
            int currentStock = stock.get(product);
            currentStock--;
            stock.put(product, currentStock);
            return true;
        }
    }

    public Set<String> products() {
        Set<String> products = new HashSet<>();
        for(String product : prices.keySet()) {
            products.add(product);
        }
        return products;
    }

}
