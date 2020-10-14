package BioCodeup;

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
        return this.name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double sumOfGrades = 0;
        double numberOfGrades = 0;
        for (int x : this.grades) {
            numberOfGrades += 1;
            sumOfGrades += x;
        }
        double average = sumOfGrades / numberOfGrades;
        return Math.round(average);
    }

    public static void main(String[] args) {

        Student student1 = new Student("Joe");
        student1.grades.add(90);
        student1.grades.add(80);
        student1.grades.add(89);
        System.out.println(student1.getGradeAverage());
        System.out.println(student1.getName());
    }
}
