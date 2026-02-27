package com.exercicio02;

public class Medico {
    public String nome;
    public String crm;
    public String telefone;
    public String especialidade;
    private String senha;

    public Medico(){}

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
        System.out.println("CPF: " + this.crm);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Genero: " + this.especialidade);
    }
}
