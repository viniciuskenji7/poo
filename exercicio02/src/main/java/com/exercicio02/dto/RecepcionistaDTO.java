package com.exercicio02.dto;

public class RecepcionistaDTO {
    private String cpf;
    private String nome;
    private String telefone;
    private String senha;

    public RecepcionistaDTO() {
    }

    public RecepcionistaDTO(String cpf, String nome, String telefone, String senha) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
