package com.exercicio02;

import java.time.LocalDate;

public class Receita {
    private Consulta consulta;
    private LocalDate data;
    private String descritivo;

    

    public Receita() {
    }

    public Receita(Consulta consulta, LocalDate data, String descritivo) {
        this.consulta = consulta;
        this.data = data;
        this.descritivo = descritivo;
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

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }
}
