import java.util.ArrayList;

public class Box implements Packable{

    private double maxWeight;
    ArrayList<Packable> items;
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        items = new ArrayList<>();
    }

    public double weight() {
        double weight = 0;
        // calculate the total weight of the items in the box
        for(Packable item : items) {
            weight += item.weight();
        }
        return weight;
    }
    public void add(Packable item) {
        if((weight() + item.weight()) < maxWeight) {
            items.add(item);
        } else {
            System.out.println("Sorry, there is not enough room to add this item.");
        }
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + ", total weight " + weight() + " kg";
    }
}
