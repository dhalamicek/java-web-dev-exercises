package exercises.datatypes;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles you have driven:");

        Double miles = input.nextDouble();


        System.out.println("Enter the the amount of gas you've consumed (in gallons):");

        Double gallons = input.nextDouble();


        Double mpg = miles/gallons;
        System.out.println("Your gas mileage is: " + mpg + "mpg");
    }
}

