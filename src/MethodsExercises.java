import javax.print.MultiDocPrintService;
import java.util.Scanner;

public class MethodsExercises {
    public static void addition(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public static void subtraction(int num1, int num2) {
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public static void multiplication(int num1, int num2) {
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
//        for (int i = )
    }

    public static void division(int num1, int num2) {
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }

    public static void modulus(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Cannot complete problem with a zero.");
        } else {
            System.out.println("Remainder of " + num1 + " divided by " + num2 + " is: " + (num1 % num2));
        }
    }

    public static int getInteger(int min, int max) {
        int x = 0;
        for (int i = min; i <= max; i++) {
            x = x + 1;
        }
        return x;
    }

    public static int factorial(int num) {
        int output = 1;
        for (int i = 1; i <= num; i++) {
            if (i <= num) {
                output = output * i;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        addition(2, 4);
//        subtraction(4, 1);
//        multiplication(5, 5);
//        division(6, 3);
//        modulus(5, 2);
//        modulus(5, 0);
        System.out.println("Enter a number between 1 and 10");
//        int userInput = getInteger(1, 10);
//        int userNum = sc.nextInt();
//        System.out.println(userNum);
//        System.out.println(getInteger(1, 10));
        System.out.println("Enter an integer between 1 and 10");
        int userInput = sc.nextInt();
//        System.out.println(factorial(3));
        for (int i = 1; i <= userInput; i++) {
            if (i == 1) {
                System.out.print(userInput + "! = ");
            }
            if (i < userInput) {
                System.out.print(i + " x ");
            } else {
                System.out.print(i + " = " + factorial(userInput));
            }
        }

    }
}
