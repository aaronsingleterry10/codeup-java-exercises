package shapes;
import util.Input;

import java.util.Scanner;

public class CircleApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Input userIn = new Input();
        System.out.println("Enter in a number representing a circle's radius:");
        int circleRadius = userIn.getInt();
        Circle userCircle = new Circle(circleRadius);
        System.out.println("You're circle's circumference is: " + userCircle.getCircumference() + "\nYou're circle's area is: " + userCircle.getArea());
        System.out.println("Would you like to enter another radius?");

        do {
            boolean yesNo = userIn.yesNo();
            if (yesNo) {
                System.out.println("Enter in a number representing a circle's radius:");
                int newRadius = userIn.getInt();
                Circle newCircle = new Circle(newRadius);
                System.out.println("You're circle's circumference is: " + newCircle.getCircumference() + "\nYou're circle's area is: " + newCircle.getArea());
                System.out.println("Would you like to continue? y/n");
            } else {
                System.out.println("Come back soon!");
                break;
            }
        } while (true);

    }


}
