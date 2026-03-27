package com.exercicio02.models;

import java.util.ArrayList;
import java.util.List;

public class Medico extends Funcionario {
    private String crm;
    private String especialidade;
    private List<Consulta> consultas = new ArrayList<>();

    public Medico(String crm, String especialidade, String nome, String senha, String telefone) throws Exception {
        super(nome, telefone, senha);
        this.setEspecialidade(especialidade);
        this.setCrm(crm);
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

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) throws Exception {
        if(crm.length() < 6 || crm.trim().isEmpty()) {
            throw new Exception("b");
        } else {
            this.crm = crm;
        }
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) throws Exception {
        if (especialidade == null || especialidade.trim().isEmpty()) {
            throw new Exception("a");
        }
        this.especialidade = especialidade;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("CRM do Médico: " + getCrm());
    }

}
