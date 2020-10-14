package BioCodeup;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
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
        return sumOfGrades / numberOfGrades;
    }

    public static void main(String[] args) {

    }
}
