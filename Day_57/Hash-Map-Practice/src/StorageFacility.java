import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    HashMap<String, ArrayList<String>> hashMap;

    public StorageFacility() {
        hashMap = new HashMap<String, ArrayList<String>>();
    }

    public void add(String unit, String item) {
        //adds the parameter item to the storage unit that is also given as a parameter.
        hashMap.putIfAbsent(unit, new ArrayList<>());
        ArrayList<String> completed = hashMap.get(unit);
        completed.add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        //returns a list that contains all the items in the storage unit
        //indicated by the parameter. If there is no such storage unit or
        //it contains no items, the method should return an empty list.
        if(hashMap.get(storageUnit) == null) {
            return new ArrayList<>();
        } else {
            return hashMap.get(storageUnit);
        }
    }

    public void remove(String storageUnit, String item) {
        //removes the given item from the given storage unit. NB! Only
        // removes one item — if there are several items with the same name,
        // the rest still remain. If the storage unit would be empty after
        // the removal, the method also removes the unit.
        for(String thing : hashMap.get(storageUnit)) {
            if(thing.equals(item)) {
                hashMap.get(storageUnit).remove(thing);
                break;
            }
            if(hashMap.get(storageUnit).size() == 0) {
                hashMap.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for(String unit : hashMap.keySet()) {
            if(hashMap.get(unit).size() > 0) {
                units.add(unit);
            }
        }
        return units;
    }

}
