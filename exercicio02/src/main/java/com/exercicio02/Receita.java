package com.exercicio02;

import java.time.LocalDate;

public class Receita {
    public Consulta consulta;
    public LocalDate data;
    public String descritivo;

    public void preescrever() {

    }

    public void consultar() {
        System.out.println("Consulta: " + this.consulta);
        System.out.println("Data: " + this.data);
        System.out.println("Descritivo: " + this.descritivo);
    }
}
