package dev.matheus.$11_Heranca_Interface_e_Polimorfismo.$3_Modificadores_de_Acesso_Protected;

import java.util.Arrays;

public class Student extends User {
    private String course;
    private double[] grade;

    public Student() {
        super();
    }

    public void calculateAverage() {
        double average = (grade[0] + grade[1]) / 2;
        System.out.println("The average of " + getName() + " is: " + average);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double[] getGrade() {
        return grade;
    }

    public void setGrade(double[] grade) {
        this.grade = grade;
    }
}
