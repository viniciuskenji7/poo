package com.exercicio02;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agenda {
    // Preciso implementar Interface futuramente
    public LocalDate data;
    public LocalTime hora;
    public Medico medico;
    public Paciente paciente;

    public void consultar() {
        System.out.println("Data: " + this.data);
        System.out.println("Hora: " + this.hora);
        System.out.println("Médico: " + this.medico);
        System.out.println("Paciente: " + this.paciente);
    }
}
