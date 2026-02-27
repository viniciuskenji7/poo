package com.exercicio02;

public class Recepcionista {
    public String nome;
    public String cpf;
    public String telefone;
    private String senha;

    public Recepcionista(){}

    public String setSenha(String senha) {
        return this.senha = senha;
    }

    public void acessar(String senha) {
        if (this.senha.equals(senha)) {
            System.out.println("Login efetuado com sucesso");
        } else {
            System.out.println("Login incorreto");
        }
    }

    //Adicionar em uma interface futuramente
    public void mostrar() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Telefone: " + this.telefone);
    }
}
