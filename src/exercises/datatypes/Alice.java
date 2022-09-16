package exercises.datatypes;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a term to search:");

        String userTerm = input.nextLine();
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or " +
                "conversation?'";
        System.out.print("The term " + userTerm + " was present: " + sentence.contains(userTerm) + "\n");
        int intIndex = sentence.indexOf(userTerm);
        int termLength = userTerm.length();
        if(sentence.contains(userTerm) == true) {
            System.out.println("It is found first at index " + intIndex + " and has a length of " + termLength);
        }
    }
}
