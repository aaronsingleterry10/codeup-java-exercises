import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            ++i;
//        }
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i = i * i;
//        } while (i < 1000000);
//        for (int i = 5; i <= 15; i++) {
//            System.out.print(i + " ");
//        }
//        for (int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }
//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int userInput = sc.nextInt();
        System.out.println("Here is your table:");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (int i = 1; i <= userInput; i++) {
            if (i * i < 10) {
                System.out.println(i + "      | " + (i * i) + "       | " + (i * i * i));
            } else {
                System.out.println(i + "      | " + (i * i) + "      | " + (i * i * i));
            }
        }
        sc.nextLine();
        System.out.println("Would you like to continue? yes/no");
        String response;
        int grade;
        while (true) {
            response = sc.nextLine();
            if (response.equals("no")) {
                System.out.println("Have a good day!");
                break;
            } else if (response.equals("yes")) {
                System.out.println("Let's continue!");
                System.out.println("Enter in a number between 0-100 to receive a grade.");
                grade = sc.nextInt();
                if (grade >= 98) {
                    System.out.println("Your grade is an A+!");
                } else if (grade <= 97 && grade >= 95) {
                    System.out.println("Your grade is an A!");
                } else if (grade <= 94 && grade >= 90) {
                    System.out.println("Your grade is an A-");
                } else if (grade <= 89 && grade >= 88) {
                    System.out.println("Your grade is a B+");
                } else if (grade <= 87 && grade >= 85) {
                    System.out.println("Your grade is a B");
                } else if (grade <= 84 && grade >= 80) {
                    System.out.println("Your grade is a B-");
                } else if (grade <= 79 && grade >= 78) {
                    System.out.println("Your grade is a C+");
                } else if (grade <= 77 && grade >= 75) {
                    System.out.println("Your grade is a C");
                } else if (grade <= 74 && grade >= 70) {
                    System.out.println("Your grade is a C-");
                } else {
                    System.out.println("You've received an F!!");
                }
                System.out.println("Would you like to try again?");
                sc.nextLine();
            } else {
                System.out.println("Invalid response");
                System.out.println("Would you like to continue? yes/no");
            }
        }
    }
}
