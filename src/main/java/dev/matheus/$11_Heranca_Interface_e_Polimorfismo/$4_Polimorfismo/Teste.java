package dev.matheus.$11_Heranca_Interface_e_Polimorfismo.$4_Polimorfismo;

public class Teste {
    public static void main(String[] args) {

        User user = new User();
        Techear techear = new Techear();
        Student student = new Student();

        user.setName("Victor Pereira");
        techear.setDepartment("TI");
        techear.setSalary("R$ 3000");
        techear.setSSN("SSN");
        student.setCourse("Java");
        student.setGrade(new double[]{8.0, 9.0});
        student.setAddress("Rua 1, N 100");
        student.setPhone("11999999999");



        techear.setAddress("Rua 1, N 100");
        techear.setPhone("11999999999");
        techear.setDepartment("Java");
        techear.setSalary("R$ 3000");
        techear.setSSN("SSN");

        student.setCourse("Java");
        student.setGrade(new double[]{8.0, 9.0});
        student.setAddress("Rua 1, N 100");
        student.setPhone("11999999999");


        String userAddressLabel = user.GetAddressLabel();
        String techearAddressLabel = techear.GetAddressLabel();
        String studentAddressLabel = student.GetAddressLabel();

        System.out.println(userAddressLabel);
        System.out.println(techearAddressLabel);
        System.out.println(studentAddressLabel);






    }
}
