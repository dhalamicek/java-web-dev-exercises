package exercises.controlflowcollections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(10);
        numbers.add(20);
        numbers.add(25);
        numbers.add(7);
        numbers.add(11);
        numbers.add(33);
        numbers.add(38);
        numbers.add(27);
        int sumEven = 0;
        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) % 2 == 0) {
                sumEven = numbers.get(i) + sumEven;
            } else {
                continue;
            }


        }

        System.out.println(sumEven);

        ArrayList<String> words = new ArrayList<>();
        words.add("hello");
        words.add("stems");
        words.add("tiled");
        words.add("driven");
        words.add("flower");

        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter the word length for the search: ");
        Integer userLength = input.nextInt();

        for (int i = 0; i < words.size(); i++) {

            if (words.get(i).length() == userLength) {
                System.out.println(words.get(i) + "\n");
            } else {
                continue;
            }

        }

    }


}

