package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGrade(int studentGrade) {
        grades.add(studentGrade);
    }

    public double getGradeAverage() {
        double gradesTotal = 0;
        int length = 0;
        for(Integer x : this.grades) {
            gradesTotal = gradesTotal + x;
            length += 1;
        }
        return gradesTotal / length;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Aaron");
        student1.addGrade(90);
        student1.addGrade(95);
        student1.addGrade(100);
        System.out.println(student1.grades);
        System.out.println(student1.getGradeAverage());

        Student student2 = new Student("Kali");
        student2.addGrade(100);
        student2.addGrade(97);
        student2.addGrade(99);
        System.out.println(student2.grades);
        System.out.println(student2.getGradeAverage());
    }
}
