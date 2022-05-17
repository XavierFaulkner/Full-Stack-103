import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    HashMap<String, ArrayList<String>> hashMap;

    public DictionaryOfManyTranslations() {
        hashMap = new HashMap<String, ArrayList<String>>();
    }

    public void add(String word, String translation) {
        //adds the translation for the word and preserves the old translations
        hashMap.putIfAbsent(word, new ArrayList<>());
        ArrayList<String> completed = hashMap.get(word);
        completed.add(translation);
    }

    public ArrayList<String> translate(String word) {
        //returns a list of the translations added for the word.
        //If the word has no translations, the method should return an empty list
        if(hashMap.get(word) == null) {
            return new ArrayList<>();
        } else {
            return hashMap.get(word);
        }
    }

    public void remove(String word) {
        //removes the word and all its translations from the dictionary.
        hashMap.remove(word);
    }

}
