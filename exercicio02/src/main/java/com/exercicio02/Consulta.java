package com.exercicio02;

import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta {
    public LocalDate data;
    public LocalTime hora;
    public Medico medico;
    public Paciente paciente;
    public String motivo;
    public String historico;

    public Consulta() {}

    public void consultar() {
        System.out.println("Data: " + this.data);
        System.out.println("Hora: " + this.hora);
        System.out.println("Médico: " + this.medico);
        System.out.println("Paciente: " + this.paciente);
    }

    public void marcar() {

    }

    public void cancelar() {

    }

    public void realizar() {

    }

    public void atualizar() {

    }

}
