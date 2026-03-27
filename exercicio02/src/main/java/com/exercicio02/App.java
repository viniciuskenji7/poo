package com.exercicio02;

import com.exercicio02.models.Medico;
import com.exercicio02.models.Recepcionista;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            Medico medico = new Medico("1234567", "Pediatra", "Carolina Masuno", "carol123456@", "11945563344");
            Recepcionista recepcionista = new Recepcionista("Anna Beatriz", "123.456.789-01", "11945563344", "anna123456@");

            medico.mostrar();
            recepcionista.mostrar();
        } catch (Exception e) {
            throw new Error(e.getMessage());
        }
    }
    
}
