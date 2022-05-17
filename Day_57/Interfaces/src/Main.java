import java.util.*;

public class Main {
    public static void main(String[] args) {

        //TacoBoxes Exercise********************************
        System.out.println("*TacoBoxes Exercise*");
        TripleTacoBox b1 = new TripleTacoBox();
        CustomTacoBox b2 = new CustomTacoBox(4);

        b1.eat();
        b2.eat();
        //should print 2
        System.out.println(b1.tacosRemaining());
        //should print 3
        System.out.println(b2.tacosRemaining());

        //Interface in a Box Exercise***********************
        System.out.println("\n*Interface in a Box Exercise*");
        Box smallBox1 = new Box(10);
        Box smallBox2 = new Box(10);

        smallBox1.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        smallBox1.add(new Book("Robert Martin", "Clean Code", 1));
        smallBox1.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        smallBox2.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        smallBox2.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        smallBox2.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        Box largeBox = new Box(20);
        largeBox.add(smallBox1);
        largeBox.add(smallBox2);

        System.out.println(largeBox);

        //List as a method parameter Exercise****************
        System.out.println("\n*List as a method parameter Exercise*");
        List<String> listNames = new ArrayList<>();
        listNames.add("First");
        listNames.add("Second");
        listNames.add("Third");

        System.out.println(returnSize(listNames));

        //Map as a method parameter Exercise*****************
        System.out.println("\n*Map as a method parameter Exercise*");
        Map<String, String> mapNames = new HashMap<>();
        mapNames.put("1", "first");
        mapNames.put("2", "second");

        System.out.println(returnSize(mapNames));

        //Set as method parameter****************************
        System.out.println("*\nSet as method parameter Exercise*");
        Set<String> setNames = new HashSet<>();
        setNames.add("first");
        setNames.add("first");
        setNames.add("second");
        setNames.add("second");
        setNames.add("second");

        System.out.println(returnSize(setNames));

        //Online shop Exercise
        System.out.println("\n*Online shop Exercise*");
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("coffee", 5, 10);
        warehouse.addProduct("milk", 3, 20);
        warehouse.addProduct("cream", 2, 55);
        warehouse.addProduct("bread", 7, 8);

        Scanner scanner = new Scanner(System.in);

        Store store = new Store(warehouse, scanner);
        store.shop("John");

    }

    public static int returnSize(List<String> list) {
        return list.size();
    }

    public static int returnSize(Map<String, String> map) {
        return map.size();
    }

    public static int returnSize(Set<String> set) {
        return set.size();
    }
}
