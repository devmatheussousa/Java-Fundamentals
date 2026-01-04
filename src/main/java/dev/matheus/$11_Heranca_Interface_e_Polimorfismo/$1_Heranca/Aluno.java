package dev.matheus.$11_Heranca_Interface_e_Polimorfismo.$1_Heranca;

public class Aluno extends Pessoa {

    private String curso;
    private double[] notas;

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

    public boolean verificarAprovacao(){
        return true;
    }
}
