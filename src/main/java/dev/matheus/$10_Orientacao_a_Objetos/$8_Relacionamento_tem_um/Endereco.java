package dev.matheus.$10_Orientacao_a_Objetos.$8_Relacionamento_tem_um;

public class Endereco {
    private String nomeRua;
    private String numero;
    private String completo;
    private String cep;
    private String cidade;
    private String estado;

    public Endereco(){

    }

    public Endereco(String nomeRua, String numero, String completo, String cep, String cidade, String estado) {
        this.nomeRua = nomeRua;
        this.numero = numero;
        this.completo = completo;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCompleto() {
        return completo;
    }

    public void setCompleto(String completo) {
        this.completo = completo;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
