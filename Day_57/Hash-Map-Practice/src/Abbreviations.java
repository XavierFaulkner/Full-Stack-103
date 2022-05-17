import java.util.HashMap;

public class Abbreviations {
    HashMap<String, String> abbreviations;

    public Abbreviations() {
        abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        //add new abbreviation
        abbreviations.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        //check if abbreviation is already in the hashmap return true/false
        if(abbreviations.get(abbreviation) != null) {
            return true;
        } else {
            return false;
        }
    }

    public String findExplanationFor(String abbreviation) {
        //gets the explanation, returns null if there is none
        return abbreviations.get(abbreviation);
    }

}
