import java.util.Scanner;

public class ConsoleIOLec {
    public static void main(String[] args) {
        System.out.println("Console IO Lecture");
//        System.out.print("hello\n");
//        System.out.print("world");
        String name = "Aaron";
        System.out.printf("Hello, %s!\n", name);
        int num = 5;
        String pet = "dogs";
        System.out.printf("I have %d %s\n", num, pet);
        double dollars = 10.12345;
        System.out.printf("The cost of a drink is %.2f", dollars);

        // Scanner
        Scanner sc = new Scanner(System.in);
    }
}
