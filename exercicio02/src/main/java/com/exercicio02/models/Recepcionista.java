package com.exercicio02.models;


public class Recepcionista extends Funcionario {
    private String cpf;

    public Recepcionista(String nome, String cpf, String telefone, String senha) throws Exception {
        super(nome, telefone, senha);
        setCpf(cpf);
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

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("CPF do Funcionário: " + getCpf());
    }

}
