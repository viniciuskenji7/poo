package com.exercicio02.models;

public abstract class Funcionario {
    private String nome;
    private String telefone;
    private String senha;

    public Funcionario(String nome, String telefone, String senha) throws Exception {
        setNome(nome);
        setTelefone(telefone);
        setSenha(senha);
    }

    public boolean possuiEspeciais(String s) {
        if (s == null || s.isEmpty()) return false;

        for (char c : s.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) throws Exception {
        if (nome == null) {
            throw new Exception("f");
        }
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public final void setTelefone(String telefone) throws Exception {
        if (telefone.length() < 11 || telefone.trim().isEmpty()) {
            throw new Exception("d");
        }
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public final void setSenha(String senha) throws Exception {
        if (senha.length() < 8 || !possuiEspeciais(senha) || senha.length() < 8) {
            throw new Exception("c");
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
    
    public void mostrar() {
        System.out.println("Nome do Funcionário: " + getNome() + "\nTelefone: " + getTelefone());;
    }


}
