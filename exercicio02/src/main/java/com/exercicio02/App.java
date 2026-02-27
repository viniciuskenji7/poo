package com.exercicio02;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Paciente paciente1 = new Paciente();

        paciente1.nome = "Vinicius";
        paciente1.cpf = "123.456.789-01";
        paciente1.genero = "Masculino";
        paciente1.idade = 20;
        paciente1.telefone = "11945563344";

        paciente1.mostrar();

        Medico medico1 = new Medico();

        medico1.nome = "Juarez";
        medico1.telefone = "1140028922";
        medico1.especialidade = "Clinico Geral";
        medico1.crm = "23324";
        medico1.setSenha("juarez123");

        medico1.acessar("juja");

        Recepcionista recepcionista1 = new Recepcionista();

        recepcionista1.nome = "Larissa";
        recepcionista1.cpf = "322.019.688-88";
        recepcionista1.telefone = "1125183378";

        recepcionista1.setSenha("larizinha");
        recepcionista1.acessar("rail");

        Agenda agenda = new Agenda();

        agenda.data = LocalDate.of(2026, 02, 27);
        agenda.hora = LocalTime.of(10, 30);
        agenda.medico = medico1;
        agenda.paciente = paciente1;
        
        System.out.println("Agenda: ");
        agenda.consultar();
        
        Consulta consulta = new Consulta();

        consulta.data = LocalDate.of(2026, 02, 27);
        consulta.hora = LocalTime.of(10, 30);
        consulta.medico = medico1;
        consulta.paciente = paciente1;
        consulta.motivo = "Paciente gripado";

        System.out.println("Consultas: ");
        consulta.consultar();

        Receita receita = new Receita();

        receita.consulta = consulta;
        receita.data = consulta.data;
        receita.descritivo = "Receitando Cimegripe";

        System.out.println("Receita: ");
        receita.consultar();

        Exame exame = new Exame();

        exame.consulta = consulta;
        exame.data = consulta.data;
        exame.descritivo = "Esta com coriza";

        System.out.println("Exame: ");
        exame.consultar();



    }
    
}
