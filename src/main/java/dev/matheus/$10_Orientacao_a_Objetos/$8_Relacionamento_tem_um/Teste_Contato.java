package dev.matheus.$10_Orientacao_a_Objetos.$8_Relacionamento_tem_um;

import java.util.ArrayList;
import java.util.List;

public class Teste_Contato {
    Contato contato = new Contato();

    public void cadastrarContato(String novoNome, String novoEmail, Telefone novoTelefone) {
        contato.setNome(novoNome);
        contato.setEmail(novoEmail);
        contato.setTelefone(novoTelefone);
    }

    public void cadastrarContato(String novoNome, String novoEmail, Telefone novoTelefone, Endereco novoEndereco) {
        contato.setNome(novoNome);
        contato.setEmail(novoEmail);
        contato.setTelefone(novoTelefone);
        contato.setEndereco(novoEndereco);
    }

    public static void main(String[] args) {
        Teste_Contato teste = new Teste_Contato();
        teste.cadastrarContato("Victor Hugo", "dev.victorhugor@contato.com",
                new Telefone("Celular", "11", "99999-9999"),
                new Endereco("Rua das Flores", "123", "Apto 45", "12345-678", "São Paulo", "SP"));

        Teste_Contato teste2 = new Teste_Contato();
        teste2.cadastrarContato("Matheus Silva", "dev.matheussilva@contato.com",
                new Telefone("Celular", "23", "99999-9999"),
                new Endereco("Avenida Central", "456", "Casa", "87654-321", "Rio de Janeiro", "RJ"));

        Teste_Contato teste3 = new Teste_Contato();
        teste3.cadastrarContato("Ana Pereira", "dev.anapereira@contato .com",
                new Telefone("Celular", "32", "13145-9999"),
                new Endereco("Travessa das Acácias", "789", "Bloco B", "13579-246", "Belo Horizonte", "MG"));

        List<Teste_Contato> listaDeContatos = new ArrayList<>();
        listaDeContatos.add(teste);
        listaDeContatos.add(teste2);
        listaDeContatos.add(teste3);

        for (Teste_Contato c : listaDeContatos) {
            System.out.println("------------------Contato-----------------");

            System.out.println("Nome: " + c.contato.getNome());
            System.out.println("Email: " + c.contato.getEmail());
            System.out.println("Telefone: " + c.contato.getTelefone());

            System.out.println("------------------Telefone-----------------");

            if (c.contato.getTelefone() != null) {
                System.out.println("  Tipo: " + c.contato.getTelefone().getTipo());
                System.out.println("  DDD: " + c.contato.getTelefone().getDdd());
                System.out.println("  Número: " + c.contato.getTelefone().getNumero());
            } else {
                System.out.println("Telefone: Não cadastrado");
            }

            System.out.println("------------------Endereço-----------------");

            if (c.contato.getEndereco() != null) {
                System.out.println("Endereço:");
                System.out.println("  Rua: " + c.contato.getEndereco().getNomeRua() + ", " + c.contato.getEndereco().getNumero());
                System.out.println("  Complemento: " + c.contato.getEndereco().getCompleto());
                System.out.println("  CEP: " + c.contato.getEndereco().getCep());
                System.out.println("  Cidade: " + c.contato.getEndereco().getCidade() + " - " + c.contato.getEndereco().getEstado());
            } else {
                System.out.println("Endereço: Não cadastrado");
            }
        }
    }
}
