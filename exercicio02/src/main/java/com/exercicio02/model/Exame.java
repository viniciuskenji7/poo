package com.exercicio02.model;

import java.time.LocalDate;

public class Exame extends Procedimento {

    public Exame(Consulta consulta, LocalDate data, String descritivo) throws Exception {
        super(data, descritivo, consulta);
    }

    public void solicitar() {

    }
}
