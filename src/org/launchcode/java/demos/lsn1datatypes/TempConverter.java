package org.launchcode.java.demos.lsn1datatypes;


public class TempConverter {
    public static void main(String[] args) {
        double fahrenheit;

        java.util.Scanner input;

        input = new java.util.Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");

        fahrenheit = input.nextDouble();
        input.close();


        System.out.println("The temperature in Celsius is: ");
    }
}
