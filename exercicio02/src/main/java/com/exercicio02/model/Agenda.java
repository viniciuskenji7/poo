package com.exercicio02.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    // Preciso implementar Interface futuramente
    private LocalDate data;
    private LocalTime hora;
    private Medico medico;
    private Paciente paciente;
    private List<Consulta> consultas = new ArrayList<>();

    public Agenda(LocalDate data, LocalTime hora, Medico medico, Paciente paciente) {
        this.data = data;
        this.hora = hora;
        this.medico = medico;
        this.paciente = paciente;
    }

    public Agenda() {
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
    

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }



    public void setPaciente(Paciente paciente, String cpfDigitado) throws Exception {
        if(!cpfDigitado.equals(paciente.getCpf())) {
            throw new Exception("O CPF informado é inválido");
        }
        this.paciente = paciente;
    }



    public LocalDate getData() {
        return data;
    }



    public LocalTime getHora() {
        return hora;
    }



    public Medico getMedico() {
        return medico;
    }



    public Paciente getPaciente() {
        return paciente;
    }



    public void consultar() {
        System.out.println("Data: " + this.data);
        System.out.println("Hora: " + this.hora);
        System.out.println("Médico: " + this.medico);
        System.out.println("Paciente: " + this.paciente);
    }
}
