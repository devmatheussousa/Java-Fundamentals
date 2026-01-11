package dev.matheus.$11_Heranca_Interface_e_Polimorfismo.$2_Heranca_Super;

public class Aluno extends Pessoa {

    private String curso;
    private double[] notas;


    public Aluno(){
        super();
    }

    public Aluno(String especialidade, String curso, double[] notas) {
        super(especialidade); // chama o construtor da classe Pessoa
        this.curso = curso;
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        double media = 0;
        for(int i = 0; i < notas.length; i++){
            media += notas[i];
        }
        return media / notas.length ;
    }

    public void qualQuerMetodo(){
        this.verificarAprovacao();
    }

    public boolean verificarAprovacao(){
        return true;
    }
}
