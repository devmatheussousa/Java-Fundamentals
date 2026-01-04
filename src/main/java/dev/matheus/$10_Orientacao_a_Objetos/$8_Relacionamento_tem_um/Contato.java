package dev.matheus.$10_Orientacao_a_Objetos.$8_Relacionamento_tem_um;

public class Contato {
    private String nome;
    private Telefone telefone;
    private String email;
    private Endereco endereco;

    public Contato(){

    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Telefone getTelefone(){
        return this.telefone;
    }

    public void setTelefone(Telefone telefone){
        this.telefone = telefone;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
}
