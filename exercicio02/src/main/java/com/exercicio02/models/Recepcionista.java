package com.exercicio02.models;


public class Recepcionista extends Funcionario {
    private String cpf;

    public Recepcionista(String nome, String cpf, String telefone, String senha) throws Exception {
        super(nome, telefone, senha);
        setCpf(cpf);
        setSenha(senha);
        setTelefone(telefone);
    }

    public String getCpf() {
        return cpf;
    }

    public final void setCpf(String cpf) throws Exception {
        if (cpf.length() < 11 || cpf.trim().isEmpty()) {
            throw new Exception("Este CPF é inválido");
        }
        this.cpf = cpf;
    }

    //Adicionar em uma interface futuramente
    public void mostrar() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + this.cpf);
        System.out.println("Telefone: " + getTelefone());
    }
}
