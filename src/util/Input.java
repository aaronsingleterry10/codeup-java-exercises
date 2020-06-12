package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in).useDelimiter("\n");
    }
    public String getString() {
        String input = scanner.nextLine();
        return input;
    }
    public boolean yesNo() {
        String input = scanner.next();
        if (input.equals("y")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        int input = scanner.nextInt();
        if (input >= min && input <= max) {
            return input;
        } else {
            System.out.println("Invalid number. Please enter a number between 1 and 10.");
            scanner.nextLine();
            return getInt(min, max);
        }
    }

    public int getInt() {
        int num = scanner.nextInt();
        return num;
    }

    public double getDouble(double min, double max) {
        double num = scanner.nextDouble();
        if (num >= min && num <= max) {
            return num;
        } else {
            System.out.println("Invalid number. Enter a decimal number between .99 and 9.99");
            scanner.nextLine();
            return getDouble(min, max);
        }
    }

    public double getDouble() {
        double num = scanner.nextDouble();
        return num;
    }

//    public static void main(String[] args) {
//        Input in = new Input();
//        System.out.println("Will you continue? y/n");
//        boolean yesNo = in.yesNo();
//        System.out.println(yesNo);
//    }

}
