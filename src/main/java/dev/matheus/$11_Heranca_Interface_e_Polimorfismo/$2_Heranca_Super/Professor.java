package dev.matheus.$11_Heranca_Interface_e_Polimorfismo.$2_Heranca_Super;

public class Professor extends Pessoa {

    private String especialidade;
    private double salario;

    //Explicando: O construtor da classe Professor chama o construtor da classe Pessoa passando a especialidade como parâmetro.
    //esse parametro é passado para a classe Pessoa, que é a superclasse de Professor.
    public Professor(String especialidade){
        super(especialidade); // Chama o construtor da classe Pessoa
    }

    //Explicando: O construtor da classe Professor chama o construtor da classe Pessoa sem passar nenhum parâmetro.
    //Isso é possível porque a classe Pessoa tem um construtor sem parâmetros.
    //A classe Professor é uma subclasse de Pessoa, então ela herda os atributos e métodos da classe Pessoa.
    //Nesse caso, o construtor da classe Professor chama o construtor da classe Pessoa para inicializar os atributos da classe Pessoa.
    public Professor(){
        super();
    }

    public Professor(String especialidade, double salario) {
        super(especialidade); // chama o construtor da classe Pessoa
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalarioLiquido(){
        return 0.0;
    }
}
