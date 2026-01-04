package dev.matheus.$11_Heranca_Interface_e_Polimorfismo.$1_Heranca;

public class Teste {
    public static void main(String[] args){
        Aluno aluno = new Aluno();
        aluno.setNome("Matheus");
        aluno.setCurso("Ciência da Computação");
        aluno.setEndereco("Rua Vascoleco, Lt.11 Qd.3 Casa - 123");
        aluno.setTelefone("55+ (62) 91234-5678");
        aluno.setCpf("111.222.333-44");
        aluno.setNotas(new double[]{8.5, 7.0, 9.0});
        aluno.setEmail("aluno.contato@gmail.com");

        System.out.println("Nome do Aluno: " + aluno.getNome());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("Média: " + aluno.calcularMedia());
        System.out.println("Aprovado: " + aluno.verificarAprovacao());
        System.out.println("Endereço: " + aluno.getEndereco());
        System.out.println("Telefone: " + aluno.getTelefone());
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("Email: " + aluno.getEmail());

        Professor professor = new Professor();
        professor.setNome("Dr. Silva");
        professor.setEspecialidade("Matemática");
        professor.setEndereco("Rua Jose Adoardo, Lt.6 Qd.5 Casa - 3");
        professor.setTelefone("55+ (81) 98727-4432");
        professor.setCpf("111.222.333-44");
        professor.setSalario(5000.0);
        professor.setEmail("professor.contato@gmail.com");


        System.out.println("\nNome do Professor: " + professor.getNome());
        System.out.println("Especialidade: " + professor.getEspecialidade());
        System.out.println("Salário Líquido: " + professor.calcularSalarioLiquido());
        System.out.println("Endereço: " + professor.getEndereco());
        System.out.println("Telefone: " + professor.getTelefone());
        System.out.println("CPF: " + professor.getCpf());
        System.out.println("Email: " + professor.getEmail());

        Pessoa visistante = new Visistante();
        visistante.setNome("Carlos Augusto");
        visistante.setEmail("visitante.carlos@gmail.com");
        visistante.setEndereco("Rua Guatemala, Lt.23 Qd.71 Casa - 123");
        visistante.setTelefone("55+ (11) 91234-5678");
        visistante.setCpf("123.456.789-00");

        System.out.println("\nNome do Visitante: " + visistante.getNome());
        System.out.println("Endereço: " + visistante.getEndereco());
        System.out.println("Telefone: " + visistante.getTelefone());
        System.out.println("CPF: " + visistante.getCpf());
        System.out.println("Email: " + visistante.getEmail());
    }
}
