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

    public static void main(String[] args) {
        addition(2, 4);
        subtraction(4, 1);
        multiplication(5, 5);
        division(6, 3);
        modulus(5, 2);
        modulus(5, 0);
    }
}
