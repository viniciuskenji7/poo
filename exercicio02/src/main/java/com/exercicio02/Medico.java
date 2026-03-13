package com.exercicio02;

public class Medico {
    private String nome;
    private String crm;
    private String telefone;
    private String especialidade;
    private String senha;

    public Medico(){}

    public boolean possuiEspeciais(String s) {
        if (s == null || s.isEmpty()) return false;
        
        for (char c : s.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public Medico(String crm, String especialidade, String nome, String senha, String telefone) {
        try {
            this.setCrm(crm);
            this.setNome(nome);
            this.setTelefone(telefone);
            this.setEspecialidade(especialidade);
            this.setSenha(senha);
        } catch (Exception e) {
            System.out.println("Erro ao criar Médico: " + e.getMessage());
        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome == null || nome.trim().isEmpty()) {
            throw new Exception("Ocorreu uma exceção - Valores padrões definidos");
        }
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) throws Exception {
        if(crm.length() < 6 || crm.trim().isEmpty()) {
            throw new Exception("Ocorreu uma exceção - Valores padrões definidos");
        } else {
            this.crm = crm;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) throws Exception {
        if (telefone.length() < 11 || telefone.trim().isEmpty()) {
            throw new Exception("Ocorreu uma exceção - Valores padrões definidos");
        }
        this.telefone = telefone;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) throws Exception {
        if (especialidade == null || especialidade.trim().isEmpty()) {
            throw new Exception("Ocorreu uma exceção - Valores padrões definidos");
        }
        this.especialidade = especialidade;
    }

    public String getSenha() {
        return senha;
    }

    public String setSenha(String senha) throws Exception {
        if (senha.length() < 8 || !possuiEspeciais(senha)) {
            throw new Exception("Ocorreu uma exceção - Valores padrões definidos");
        }
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
        System.out.println("Nome: " + getNome());
        System.out.println("CRM: " + getCrm());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Especialidade: " + getEspecialidade());
    }
}
