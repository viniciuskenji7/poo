package com.exercicio02.model;

import java.time.LocalDate;

public class Receita extends Procedimento {

    public Receita(Consulta consulta, LocalDate data, String descritivo) throws Exception {
        super(data, descritivo, consulta);
    }

    public void preescrever() {

    }


}
