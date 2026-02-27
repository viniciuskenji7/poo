package com.exercicio02;

public class Paciente {
    public String nome;
    public String cpf;
    public String telefone;
    public String genero;
    public int idade;

    public Paciente() {};

    public void cadastrar() {
        System.out.println("Paciente cadastrado!");
    }

    //Adicionar em uma interface futuramente
    public void mostrar() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Genero: " + this.genero);
        System.out.println("Idade: " + this.idade);
    }
}
