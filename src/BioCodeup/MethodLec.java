package BioCodeup;

public class MethodLec {
    public static void main(String[] args) {
        System.out.println("4 + 3 = " + sum(4, 3));
        System.out.println("43 - 12 = " + subtract(43, 12));
        System.out.println("20 X 10 = " + multiply(20, 10));
        System.out.println("30 / 5 = " + division(30, 5));
    }

    public static String sayHello(String name) {
        return String.format("Hello, %s!", name);
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }


}
