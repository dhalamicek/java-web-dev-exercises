package exercises;


import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 5, 8};
        for(int i=0; i < arr.length; i++) {
            System.out.print(arr[i]);
        };
        System.out.print("\n");
        for(int i=0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i]);
            }
            };
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in" +
                " a house. I will not eat them with a mouse.";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        String[] pieces = sentence.split("\\.");
        System.out.println(Arrays.toString(pieces));
    };
    };









