package dev.matheus.$11_Heranca_Interface_e_Polimorfismo.$7_ObjectClasses;

import java.util.HashMap;

public class Teste {
    public static void main(String[] args){
        Student student = new Student("Matheus", "Rua 1", "123456789", "12345678900", "Java", (byte) 20, new double[]{8.0, 9.0});
        System.out.println(student);
        System.out.println(student.GetAddressLabel());
        student.calculateAverage();

        HashMap<String, String> map = new HashMap<>();
        map.put("70624258181", "Matheus Sousa");
        map.put("70876782818", "Vitoria Santos Cardoso");
        map.put("40672782821", "Maria Alice Santos");
        map.put("90767853131", "Vanessa Amaral");

        //Buscando por Cpf
        System.out.printf("O aluno com CPF %s se chama %s.%n", "70624258181", map.get("70624258181"));
        System.out.printf("O aluno com CPF %s se chama %s.%n", "70876782818", map.get("70876782818"));
        System.out.printf("O aluno com CPF %s se chama %s.%n", "40672782821", map.get("40672782821"));
        System.out.printf("O aluno com CPF %s se chama %s.%n", "90767853131", map.get("90767853131"));
    }
}
