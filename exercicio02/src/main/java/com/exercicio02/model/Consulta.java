package com.exercicio02.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Consulta {
    private LocalDate data;
    private LocalTime hora;
    private Medico medico;
    private Recepcionista recepcionista;
    private Paciente paciente;
    private String motivo;
    private String historico;
    private List<Receita> receitas = new ArrayList<>();
    private List<Exame> exames = new ArrayList<>();

    public List<Receita> getReceitas() {
        return receitas;
    }

    public void setReceitas(List<Receita> receitas) {
        this.receitas = receitas;
    }

    public void addReceita(Receita receita) {
        this.receitas.add(receita);
    }

    public void removeReceita(Receita receita) {
        this.receitas.remove(receita);
    }

    public List<Exame> getExames() {
        return exames;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }

    public void addExame(Exame exame) {
        this.exames.add(exame);
    }

    public void removeExame(Exame exame) {
        this.exames.remove(exame);
    }

    public Consulta() {}

    public Consulta(LocalDate data, String historico, LocalTime hora, Medico medico, String motivo, Paciente paciente) {
        this.data = data;
        this.historico = historico;
        this.hora = hora;
        this.medico = medico;
        this.motivo = motivo;
        this.paciente = paciente;
    }

    public Recepcionista getRecepcionista() {
        return recepcionista;
    }

    public void setRecepcionista(Recepcionista recepcionista) {
        this.recepcionista = recepcionista;
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

    public void setMedico(Medico medico, String crmDigitado) throws Exception {
        if (!crmDigitado.equals(medico.getCrm())) {
            throw new Exception("Ocorreu uma exceção - Valores padrões definidos");
        }

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
