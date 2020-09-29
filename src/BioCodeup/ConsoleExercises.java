package BioCodeup;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f", pi);
//        System.out.println("Enter an integer");
//        int userNum = sc.nextInt();
//        System.out.printf("You have entered the integer: %d", userNum);
//        System.out.println("Enter in 3 words");
//        String firstWord = sc.nextLine();
//        String secondWord = sc.nextLine();
//        String thirdWord = sc.nextLine();
//        System.out.printf("You have entered \"%s\", \"%s\", and \"%s\"", firstWord, secondWord, thirdWord);
        System.out.println("Enter in the width of the room");
        int width = Integer.parseInt(sc.nextLine());

        System.out.println("Enter in the length of the room");
        int length = Integer.parseInt(sc.nextLine());

        System.out.println("The area of your room is: " + (width * length));
        System.out.println("The perimeter of your room is: " + ((width * 2) + (length * 2)));
        System.out.printf("The area of your room is %d\n", (width * length));
        System.out.printf("The perimeter of your room is: %d\n", ((width * 2) + (length * 2)));
    }
}
