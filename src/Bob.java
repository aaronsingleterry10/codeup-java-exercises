import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you wanna talk to Bob?");
        String response = sc.nextLine();
        while (response.equals("yes")) {
            System.out.println("Bob: Yo.");
            String userInput = sc.nextLine();
            if (userInput.endsWith("?")) {
                System.out.println("Bob: Sure?");
                System.out.println("Would you like to continue to talk with Bob?");
                response = sc.nextLine();
            } else if (userInput.endsWith("!")) {
                System.out.println("Bob: Whoa, chill out!");
                System.out.println("Would you like to continue to talk with Bob?");
                response = sc.nextLine();
            } else if (userInput.length() <= 0) {
                System.out.println("Fine, be that way!");
                System.out.println("Would you like to continue to talk with Bob?");
                response = sc.nextLine();
            } else {
                System.out.println("Whatever.");
                System.out.println("Would you like to continue to talk with Bob?");
                response = sc.nextLine();
            }
        }
        if (response.equals("no")) {
            System.out.println("Bye Felicia.");
        }
    }
}
