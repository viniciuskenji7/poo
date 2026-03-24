package com.exercicio02.model;

import java.time.LocalDate;

public class Exame {
    private Consulta consulta;
    private LocalDate data;
    private String descritivo;

    public Exame(Consulta consulta, LocalDate data, String descritivo) {
        this.consulta = consulta;
        this.data = data;
        this.descritivo = descritivo;
    }

    public Exame() {
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

    public void setDescritivo(String descritivo) throws Exception {
        if (descritivo.length() <= 2 || descritivo.trim().isEmpty()) {
            throw new Exception("Ocorreu uma exceção - Valores padrões definidos");
        } else {
            this.descritivo = descritivo;
        }
    }

    public void solicitar() {

    }

    public void consultar() {
        System.out.println("Consulta: " + this.consulta);
        System.out.println("Data: " + this.data);
        System.out.println("Descritivo: " + this.descritivo);
    }
}
