package dev.matheus.$11_Heranca_Interface_e_Polimorfismo.$3_Modificadores_de_Acesso_Protected;

public class Teste {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Matheus");
        student.setAddress("Rua 1");
        student.setPhone("123456789");
        student.setSSN("12345678900");
        student.setCourse("Java");
        student.setGrade(new double[]{8.0, 9.0});
        student.calculateAverage();

        Techear techear = new Techear();
        techear.setName("Lucas moura");
        techear.setAddress("Rua 1");
        techear.setPhone("123456789");
        techear.setSSN("12345678900");
        techear.setDepartment("TI");
        techear.setSalary("5000");

        System.out.printf("The techear %s is in the department %s and has a salary of %s",
                techear.getName(),
                techear.getDepartment(),
                techear.getSalary());
    }
}
