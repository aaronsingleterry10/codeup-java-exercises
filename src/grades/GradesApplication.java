package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        students.put("codesoldier", new Student("John"));
        students.put("hackerattacker", new Student("Steve"));
        students.put("syntaxwarrior", new Student("Cody"));
        System.out.println(students);

        students.get("codesoldier").addGrade(85);
        students.get("codesoldier").addGrade(90);
        students.get("codesoldier").addGrade(80);

        students.get("hackerattacker").addGrade(100);
        students.get("hackerattacker").addGrade(92);
        students.get("hackerattacker").addGrade(97);

        students.get("syntaxwarrior").addGrade(70);
        students.get("syntaxwarrior").addGrade(80);
        students.get("syntaxwarrior").addGrade(78);

        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");
        System.out.println("|codesoldier|  |hackerattacker|  |syntaxwarrior|");
        System.out.println("What student would you like to see more information on?");
    }
}
