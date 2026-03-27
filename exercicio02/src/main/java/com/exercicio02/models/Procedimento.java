package com.exercicio02.models;

import java.time.LocalDate;

public abstract class Procedimento {
    private LocalDate data;
    private String descritivo;
    private Consulta consulta;

    public Consulta getConsulta() {
        return consulta;
    }

    public final void setConsulta(Consulta consulta) throws Exception {
        this.consulta = consulta;
    }

    public Procedimento(LocalDate data, String descritivo, Consulta consulta) throws Exception {
        setData(data, consulta);
        setConsulta(consulta);
        setDescritivo(descritivo);
    }

    public LocalDate getData() {
        return data;
    }

    public final void setData(LocalDate data, Consulta dataConsulta) throws Exception {
        if (!data.equals(dataConsulta.getData())) {
            throw new Exception("Data inválida");
        }
        this.data = data;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public final void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }


    public void consultar() {
        System.out.println("Consulta: " + this.consulta);
        System.out.println("Data: " + this.data);
        System.out.println("Descritivo: " + this.descritivo);
    }
}
