package exercises.datatypes;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {

        Scanner userLength = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");

        int length = userLength.nextInt();


        Scanner userWidth = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle:");

        int width = userWidth.nextInt();


        int area = (length * width);
        System.out.println("The area of the rectangle is: " + area);
    }
}
