package exercises.controlflowcollections;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
       HashMap<Integer, String> students = new HashMap<>();
       Scanner input = new Scanner(System.in);
       String newStudent;

       //System.out.println("Enter student name (or press ENTER to finish): ");

       do {

           System.out.print("Student Name: ");
           newStudent = input.nextLine();


           if (!newStudent.equals("")) {
               System.out.print("Student ID: ");
               Integer newId = input.nextInt();
               students.put(newId, newStudent);

               input.nextLine();
           }
       } while(!newStudent.equals(""));
       input.close();

       System.out.println("\nClass roster:");

       for (Map.Entry<Integer, String> student : students.entrySet()) {
           System.out.println(student.getValue() + ": " + student.getKey());

    }
}
}
