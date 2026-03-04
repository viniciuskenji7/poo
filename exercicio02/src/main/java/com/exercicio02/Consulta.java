package com.exercicio02;

import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta {
    private LocalDate data;
    private LocalTime hora;
    private Medico medico;
    private Paciente paciente;
    private String motivo;
    private String historico;

    public Consulta() {}

    public Consulta(LocalDate data, String historico, LocalTime hora, Medico medico, String motivo, Paciente paciente) {
        this.data = data;
        this.historico = historico;
        this.hora = hora;
        this.medico = medico;
        this.motivo = motivo;
        this.paciente = paciente;
    }
    

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

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
