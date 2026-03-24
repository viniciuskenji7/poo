package com.exercicio02.model;

import java.time.LocalDate;

public class Receita {
    private Consulta consulta;
    private LocalDate data;
    private String descritivo;

    

    public Receita() {
    }

    public Receita(Consulta consulta, LocalDate data, String descritivo) throws Exception {
        try {
            this.setConsulta(consulta);
            this.setData(data, consulta);
            this.setDescritivo(descritivo);
        } catch (Exception e) {
            System.out.println("Erro ao criar Receita: " + e.getMessage());
        }
    }

    public void preescrever() {

    }

    public void consultar() {
        System.out.println("Consulta: " + this.consulta);
        System.out.println("Data: " + this.data);
        System.out.println("Descritivo: " + this.descritivo);
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) throws Exception {
        this.consulta = consulta;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data, Consulta dataConsulta) throws Exception {
        if (!data.equals(dataConsulta.getData())) {
            throw new Exception("Data inválida");
        }
        this.data = data;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }
}
