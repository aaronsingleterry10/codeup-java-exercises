package util;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Input in = new Input();
        System.out.println("Will you continue? y/n");
        boolean yesNo = in.yesNo();
        System.out.println(yesNo);

        System.out.println("Please enter in a whole number");
        int num = in.getInt();
        System.out.println(num);

        System.out.println("Enter a whole number between 1 and 10");
        boolean numInRange = in.getInt(1, 10);
        do {
        System.out.println("Out of range, try again");

        } while (!numInRange);

    }
}
