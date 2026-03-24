package com.exercicio02.model;
public class Recepcionista {
    private String nome;
    private String cpf;
    private String telefone;
    private String senha;
    
    public boolean possuiEspeciais(String s) {
        if (s == null || s.isEmpty()) return false;
        
        for (char c : s.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }
    
    public Recepcionista(String nome, String cpf, String telefone, String senha) throws Exception {
        setNome(nome);
        setCpf(cpf);
        setSenha(senha);
        setTelefone(telefone);
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) throws Exception {
        if (nome == null || nome.trim().isEmpty()) {
            throw new Exception("Ocorreu uma exceção - Valores padrões definidos");
        }
        this.nome = nome;
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

    public String getTelefone() {
        return telefone;
    }

    public final void setTelefone(String telefone) throws Exception {
        if (telefone.length() < 11 || telefone.trim().isEmpty()) {
            throw new Exception("Ocorreu uma exceção - Valores padrões definidos");
        }
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public Recepcionista(){}

    public final void setSenha(String senha) throws Exception {
        if (senha.length() < 8 || !possuiEspeciais(senha) || senha.length() < 8) {
            throw new Exception("Ocorreu uma exceção - Valores padrões definidos");
        }
        this.senha = senha;
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
