package BioCodeup;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student s1 = new Student("Joe");
        s1.addGrade(90);
        s1.addGrade(95);
        s1.addGrade(99);
        Student s2 = new Student("Sally");
        s2.addGrade(88);
        s2.addGrade(100);
        s2.addGrade(97);
        Student s3 = new Student("Emily");
        s3.addGrade(96);
        s3.addGrade(100);
        s3.addGrade(85);
        Student s4 = new Student("Carl");
        s4.addGrade(75);
        s4.addGrade(88);
        s4.addGrade(90);
        students.put("codeslayer", s1);
        students.put("hacker2000", s2);
        students.put("syntaxqueen", s3);
        students.put("flyguy", s4);

//        System.out.println(students);
        int[] numbers = new int[]{1,2,3,4};
        int result = 0;
        for (int number : numbers) {
            result *= number;
        }
        System.out.println(result);


    }
}
