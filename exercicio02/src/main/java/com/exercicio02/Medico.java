package com.exercicio02;

public class Medico {
    private String nome;
    private String crm;
    private String telefone;
    private String especialidade;
    private String senha;

    public Medico(){}

    public Medico(String crm, String especialidade, String nome, String senha, String telefone) {
        this.crm = crm;
        this.especialidade = especialidade;
        this.nome = nome;
        this.senha = senha;
        this.telefone = telefone;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) throws Exception {
        if(crm.length() < 6) {
            throw new Exception("O crm é invalido");
        } else {
            this.crm = crm;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getSenha() {
        return senha;
    }

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
