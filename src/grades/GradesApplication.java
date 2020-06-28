package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Input in = new Input();
        Scanner sc = new Scanner(System.in);


        Student student1 = new Student("John");
        student1.addGrade(100);
        student1.addGrade(90);
        student1.addGrade(80);
        students.put("codesoldier", student1);

        Student student2 = new Student("Bob");
        student2.addGrade(80);
        student2.addGrade(70);
        student2.addGrade(90);
        students.put("hackerattacker", student2);

        Student student3 = new Student("Kim");
        student3.addGrade(100);
        student3.addGrade(100);
        student3.addGrade(100);
        students.put("syntaxwarrior", student3);

        Student student4 = new Student("Jim");
        student4.addGrade(73);
        student4.addGrade(85);
        student4.addGrade(99);
        students.put("pythonkai", student4);

        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");

        for (String x: students.keySet()) {
            System.out.println("|" + x + "|" + "  ");
        }
        String input;
        do {
            System.out.println("What student would you like to see more information on? Or if you want to see everyone's grades, enter \"all\". One more thing, if you'd like to see the overall class grade average, enter \"average\"");
            input = sc.nextLine();
            if (students.containsKey(input)) {
                System.out.println("Name: " + students.get(input).getName() + " - GitHub Username: " + input);
                System.out.println("Grades: " + students.get(input).getGrades());
                System.out.println("Current average: " + students.get(input).getGradeAverage());
                System.out.println("Would you like to see another student? y/n");
                input = sc.nextLine();
                if (input.equalsIgnoreCase("n")) {
                    System.out.println("Goodbye!");
                }
            } else if (input.equalsIgnoreCase("all")) {
                for (String x: students.keySet()) {
                    System.out.print("|" + x + "|" + " Grades: " + students.get(x).getGrades() + "\n");
                }
                System.out.println("Would you like to see another student? y/n");
                input = sc.nextLine();
                if (input.equalsIgnoreCase("n")) {
                    System.out.println("Goodbye!");
                }
            } else if (input.equalsIgnoreCase("average")) {
                double avg = 0;
                int length = 0;
                for (String x: students.keySet()) {
                    avg += students.get(x).getGradeAverage();
                    length += 1;
                }
                System.out.println(avg / length);
                System.out.println("Would you like to see another student? y/n");
                input = sc.nextLine();
                if (input.equalsIgnoreCase("n")) {
                    System.out.println("Goodbye!");
                }
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + "\"" + input + "\".");
                System.out.println("Would you like to see another student? y/n");
                input = sc.nextLine();
                if (input.equalsIgnoreCase("n")) {
                    System.out.println("Goodbye!");
                }
            }
        } while (input.equalsIgnoreCase("y"));
    }
}
