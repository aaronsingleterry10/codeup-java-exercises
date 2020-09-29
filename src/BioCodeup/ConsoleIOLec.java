package BioCodeup;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleIOLec {
    public static void main(String[] args) {
        System.out.println("Console IO Lecture");
//        System.out.print("hello\n");
//        System.out.print("world");
//        String name = "Aaron";
//        System.out.printf("Hello, %s!\n", name);
//        int num = 5;
//        String pet = "dogs";
//        System.out.printf("I have %d %s\n", num, pet);
//        double dollars = 10.12345;
//        System.out.printf("The cost of a drink is %.2f", dollars);

        // Scanner
        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter your full name:");
//        String firstName = sc.next();
//        String middleName = sc.next();
//        String lastName = sc.next();
//        System.out.printf("Hello, %s %s %s!\n",firstName, middleName, lastName);

//        System.out.println("How old are you?");
//        int age = sc.nextInt();
//        System.out.printf("You are %d years old. Wow\n", age);

        // Wait, I want the whole line! How do I do that?
        System.out.println("What is your favorite quote?");
        String quote = sc.nextLine();
        System.out.printf("Wow \"%s\" is a great quote.\n", quote);
    }
}
