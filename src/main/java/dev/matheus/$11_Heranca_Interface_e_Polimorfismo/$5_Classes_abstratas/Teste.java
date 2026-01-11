package dev.matheus.$11_Heranca_Interface_e_Polimorfismo.$5_Classes_abstratas;

public class Teste {
    public static void main(String[] args) {

        Student student = new Student("Matheus", "Rua 1", "123456789", "12345678900", "Java", new double[]{8.0, 9.0});
        System.out.println(student);
        System.out.println(student.GetAddressLabel());

    }

}
