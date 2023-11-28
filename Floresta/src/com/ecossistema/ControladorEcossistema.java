package com.ecossistema;

import com.ecossistema.animais.*;
import com.ecossistema.plantas.*;
import com.ecossistema.fenomenos.*;
import com.ecossistema.ecossistema.*;

public class ControladorEcossistema {
    public static void main(String[] args) {
        Ecossistema ecossistema = new Ecossistema();
        
        System.out.println("Simulação do ecossistema iniciada.");
        int dias = 2; // Número de dias da simulação
        for (int dia = 1; dia <= dias; dia++) {
            System.out.println("Dia " + dia);

            // Adicionando animais ao ecossistema
            Animal lobo = new Lobo("Lobo Cinzento", 5);
            Animal coelho = new Coelho("Coelho Saltitante", 2);
            Animal aguia = new Aguia("Águia Real", 8);

            ecossistema.adicionarAnimal(lobo);
            ecossistema.adicionarAnimal(coelho);
            ecossistema.adicionarAnimal(aguia);

            // Adicionando plantas ao ecossistema
            Planta arvore = new Arvore("Carvalho");
            Planta arbusto = new Arbusto("Rosa");
            Planta grama = new Grama("Grama Verde");

            ecossistema.adicionarPlanta(arvore);
            ecossistema.adicionarPlanta(arbusto);
            ecossistema.adicionarPlanta(grama);

            // Adicionando fenômenos ao ecossistema
            Fenomeno incendio = new Incendio();
            Fenomeno tempestade = new Tempestade();
            Fenomeno sol = new Sol();
            Fenomeno chuva = new Chuva();

            ecossistema.adicionarFenomeno(incendio);
            ecossistema.adicionarFenomeno(tempestade);
            ecossistema.adicionarFenomeno(sol);
            ecossistema.adicionarFenomeno(chuva);

            // Simulando o ecossistema
            ecossistema.simular();
        }
    }
}
