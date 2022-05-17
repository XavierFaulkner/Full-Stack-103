import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    Map<String, Item> items;

    public ShoppingCart() {
        items = new HashMap<>();
    }

    public void add(String product, int price) {
        //adds an item to the cart that matches the product given as a
        // parameter, with the price given as a parameter.
        for(String s : items.keySet()) {
            if(s.equals(product)) {
                items.get(s).increaseQuantity();
                return;
            }
        }
        Item t = new Item(product, price);
        items.put(product, t);
    }

    public int price() {
        //returns the total price of the shopping cart.
        int totalPrice = 0;
        for(Item t : items.values()) {
            totalPrice += t.price();
        }
        return totalPrice;
    }

    public void print() {
        for(Item t : items.values()) {
            System.out.println(t.toString());
        }
    }
}
