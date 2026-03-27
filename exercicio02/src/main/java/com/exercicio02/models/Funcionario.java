package com.exercicio02.models;

public class Funcionario {
    private String nome;
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

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) throws Exception {
        if (nome == null || nome.trim().isEmpty()) {
            throw new Exception("Ocorreu uma exceção - Valores padrões definidos");
        }
        this.nome = nome;
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

    public final void setSenha(String senha) throws Exception {
        if (senha.length() < 8 || !possuiEspeciais(senha) || senha.length() < 8) {
            throw new Exception("Ocorreu uma exceção - Valores padrões definidos");
        }
        this.senha = senha;
    }

    public Funcionario(String nome, String telefone, String senha) throws Exception {
        setNome(this.nome);
        setTelefone(this.telefone);
        setSenha(this.senha);
    }

    public void acessar(String senha) {
        if (this.senha.equals(senha)) {
            System.out.println("Login efetuado com sucesso");
        } else {
            System.out.println("Login incorreto");
        }
    }
}
