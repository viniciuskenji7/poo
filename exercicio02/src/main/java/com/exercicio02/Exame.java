package com.exercicio02;

import java.time.LocalDate;

public class Exame {
    public Consulta consulta;
    public LocalDate data;
    public String descritivo;

    public void solicitar() {

    }

    public void consultar() {
        System.out.println("Consulta: " + this.consulta);
        System.out.println("Data: " + this.data);
        System.out.println("Descritivo: " + this.descritivo);
    }
}
