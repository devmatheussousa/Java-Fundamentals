package dev.matheus.$11_Heranca_Interface_e_Polimorfismo.$6_Palavra_chave_final;

import dev.matheus.$11_Heranca_Interface_e_Polimorfismo.$4_Polimorfismo.User;

import java.util.Arrays;

public class Student extends User {
    private String course;
    private double[] grade;

    public Student() {
        super();
    }

    public Student(String name,
                   String address,
                   String phone,
                   String SSN,
                   String course,
                   double[] grade) {
        super(name, address, phone, SSN);
        this.course = course;
        this.grade = grade;
    }



    public void calculateAverage() {
        double average = (grade[0] + grade[1]) / 2;
        String status = average >= 7.0 ? "Approved" : "Reproved";
        System.out.println("The status of " + getName() + " is: " + status);
        System.out.println("The average of " + getName() + " is: " + average);
    }

    @Override
    public String GetAddressLabel() {
        return "Course: " + course + "\n" + super.GetAddressLabel();
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

    @Override
    public String toString() {
        return "Student{" +
                "course='" + course + '\'' +
                ", grade=" + Arrays.toString(grade) +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", SSN='" + getSSN() + '\'' +
                '}';
    }
}
