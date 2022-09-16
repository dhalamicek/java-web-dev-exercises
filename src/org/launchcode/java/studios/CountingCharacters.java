package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> characterCount = new HashMap<>();
        String testString = "If the product of two terms is zero then common sense says at least one of the two terms " +
                "has to be zero to start with. So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side of the equation to equal zero. Once " +
                "you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = testString.toLowerCase().toCharArray();
        for (char character : charactersInString) {
            if (characterCount.containsKey(character)) {
                char key = character;
                int value = characterCount.get(key) + 1;
                characterCount.put(character, value);
               ;
            } else {
                characterCount.put(character, 1);
            }
        }
        for(Map.Entry<Character, Integer> charCount : characterCount.entrySet()){
            System.out.println(charCount.getKey() +": " + charCount.getValue());
        }
    }
}

