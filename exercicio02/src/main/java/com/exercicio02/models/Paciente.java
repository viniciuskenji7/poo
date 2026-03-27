package com.exercicio02.models;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nome;
    private Recepcionista recepcionista;
    private String cpf;
    private String telefone;
    private String genero;
    private int idade;
    private String email;
    private List<Consulta> consultas = new ArrayList<>();

    public Recepcionista getRecepcionista() {
        return recepcionista;
    }

    public void setRecepcionista(Recepcionista recepcionista) {
        this.recepcionista = recepcionista;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public void addConsulta(Consulta consulta) {
        this.consultas.add(consulta);
    }

    public void removeConsulta(Consulta consulta) {
        this.consultas.remove(consulta);
    }
    
    public Paciente(String nome, String cpf, String telefone, String genero, int idade) {
        try {
            this.setNome(nome);
            this.setCpf(cpf);
            this.setTelefone(telefone);
            this.setGenero(genero);
            this.setIdade(idade);
            cadastrar();
        } catch (Exception e) {
            System.out.println("Erro ao criar Paciente - " + e.getMessage());
        }
    }

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception{
        if (nome == null || nome.trim().isEmpty()) {
            throw new Exception("Ocorreu uma exceção - Valores padrões definidos");
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception {
        if (cpf.length() < 11 || cpf.trim().isEmpty()) {
            throw new Exception("Ocorreu uma exceção - Valores padrões definidos");
        }

        this.cpf = cpf;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) throws Exception {
        if (genero == null || genero.trim().isEmpty()) {
            throw new Exception("Ocorreu uma exceção - Valores padrões definidos");
        }
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws Exception {
        if (idade <= 0) {
            throw new Exception("Ocorreu uma exceção - Valores padrões definidos");
        }
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) throws Exception {
        if (email == null || email.length() < 6 || !email.contains("@")) {
            throw new Exception("Email completo obrigatório");
        } else {
            this.email = email;
        }
    }

    
}
