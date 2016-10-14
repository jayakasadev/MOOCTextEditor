package spelling;

import java.util.LinkedList;

/**
 * A class that implements the Dictionary interface using a LinkedList
 *
 */
public class DictionaryLL implements Dictionary {

	private LinkedList<String> dict;

    public DictionaryLL(){
        dict = new LinkedList<>();
    }


    /** Add this word to the dictionary.  Convert it to lowercase first
     * for the assignment requirements.
     * @param word The word to add
     * @return true if the word was added to the dictionary 
     * (it wasn't already there). */
    //O(1)
    public boolean addWord(String word) {
        word = word.toLowerCase();
        if(dict.contains(word))
            return false;
        return dict.add(word);
    }


    /** Return the number of words in the dictionary */
    public int size() {
        return dict.size();
    }

    /** Is this a word according to this dictionary? */
    //O(n)
    public boolean isWord(String s) {
        //TODO: Implement this method
        /*
        int cap = 0;

        for(int a = 0; a < s.length(); a++){
            if(Character.isUpperCase(s.charAt(a)))
                cap++;
        }
        if(cap > 1 || cap == 0)
            return false;
        */
        return dict.contains(s.toLowerCase());
    }

    
}
