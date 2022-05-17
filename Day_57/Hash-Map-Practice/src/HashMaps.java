import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {

        //exercise #1
        System.out.println("Exercise #1");
        HashMap<String, String> nicknames = new HashMap<>();
        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");
        System.out.println(nicknames.get("matthew"));

        //exercise #2
        System.out.println("\nExercise #2");
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");
        abbreviations.addAbbreviation("lol", "laugh out loud");
        //should return true
        System.out.println(abbreviations.hasAbbreviation("lol"));
        //should return false
        System.out.println(abbreviations.hasAbbreviation("asap"));
        //should return "for example"
        System.out.println(abbreviations.findExplanationFor("e.g."));
        //should return null
        System.out.println(abbreviations.findExplanationFor("asap"));

        //exercise #3
        System.out.println("\nExercise #3");
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");

        //exercise #4
        System.out.println("\nExercise #4");
        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "precis");

        //exercise #5
        System.out.println("\nExercise #5");
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));

        mattsIOU.setSum("Arthur", 10.5);
        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
    }

    //exercise #3 methods
    public static void printKeys(HashMap<String, String> hashmap) {
        //prints all the keys in the hashmap given as a parameter
        for(String abbreviation : hashmap.keySet()) {
            System.out.println(abbreviation);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        //prints the keys in the hashmap given as a parameter, which contain the string given as a parameter
        for(String abbreviation : hashmap.keySet()) {
            if(abbreviation.contains(text)) {
                System.out.println(abbreviation);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        //prints the values in the given hashmap which keys contain the given string
        for(String abbreviation : hashmap.keySet()) {
            if(abbreviation.contains(text)) {
                System.out.println(hashmap.get(abbreviation));
            }
        }
    }

    //exercise #4 methods
    public static void printValues(HashMap<String, String> hashmap) {
        for(String abbreviation : hashmap.keySet()) {
            System.out.println(hashmap.get(abbreviation));
        }
    }

    public static void printValueIfNameContains(HashMap<String, String> hashmap, String text) {
        for(String value : hashmap.values()) {
            if(value.contains(text)) {
                System.out.println(value);
            }
        }
    }
}
