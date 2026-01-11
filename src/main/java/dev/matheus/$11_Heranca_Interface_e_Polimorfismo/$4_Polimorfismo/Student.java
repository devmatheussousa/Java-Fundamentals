package dev.matheus.$11_Heranca_Interface_e_Polimorfismo.$4_Polimorfismo;

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
                ", grade=" + grade +
                '}';
    }
}
