import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f", pi);

//        System.out.println("Enter a number:");
//        int userInput = sc.nextInt();
//        System.out.println(userInput);

        System.out.println("Enter three different words:");
        String userInput1 = sc.next();
        String userInput2 = sc.next();
        String userInput3 = sc.next();
        System.out.printf("%s%n%s%n%s",userInput1, userInput2, userInput3);

    }
}
