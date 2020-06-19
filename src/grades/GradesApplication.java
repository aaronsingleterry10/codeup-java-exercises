package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Input in = new Input();
        Scanner sc = new Scanner(System.in);



//        students.put("codesoldier", new Student("John"));
//        students.put("hackerattacker", new Student("Steve"));
//        students.put("syntaxwarrior", new Student("Cody"));
//        students.put("pythonkai", new Student("Mark"));
//        System.out.println(students);
        Student student1 = new Student("John");
        student1.addGrade(100);
        student1.addGrade(90);
        student1.addGrade(80);
        students.put("codesoldier", student1);
//        students.get("codesoldier").addGrade(85);
//        students.get("codesoldier").addGrade(90);
//        students.get("codesoldier").addGrade(80);
        Student student2 = new Student("Bob");
        student2.addGrade(80);
        student2.addGrade(70);
        student2.addGrade(90);
        students.put("hackerattacker", student2);
//        students.get("hackerattacker").addGrade(100);
//        students.get("hackerattacker").addGrade(92);
//        students.get("hackerattacker").addGrade(97);
        Student student3 = new Student("Kim");
        student3.addGrade(100);
        student3.addGrade(100);
        student3.addGrade(100);
        students.put("syntaxwarrior", student3);
//        students.get("syntaxwarrior").addGrade(70);
//        students.get("syntaxwarrior").addGrade(80);
//        students.get("syntaxwarrior").addGrade(78);
        Student student4 = new Student("Jim");
        student4.addGrade(73);
        student4.addGrade(85);
        student4.addGrade(99);
        students.put("pythonkai", student4);

//        students.get("pythonkai").addGrade(85);
//        students.get("pythonkai").addGrade(88);
//        students.get("pythonkai").addGrade(72);

        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");
//        System.out.println("|codesoldier|  |hackerattacker|  |syntaxwarrior|  |pythonkai|");
        for (String x: students.keySet()) {
            System.out.print("|" + x + "|" + "  ");
        }
        String input;
        do {
            System.out.println("What student would you like to see more information on?");
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
