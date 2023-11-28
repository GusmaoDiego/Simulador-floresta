package com.ecossistema.ecossistema;

import com.ecossistema.animais.Animal;
import com.ecossistema.fenomenos.Fenomeno;
import com.ecossistema.plantas.Planta;

import java.util.ArrayList;
import java.util.List;

public class Ecossistema {
    private List<Animal> animais;
    private List<Fenomeno> fenomenos;
    private List<Planta> plantas;

    public Ecossistema() {
        animais = new ArrayList<>();
        fenomenos = new ArrayList<>();
        plantas = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void adicionarFenomeno(Fenomeno fenomeno) {
        fenomenos.add(fenomeno);
    }
    
    public void adicionarPlanta(Planta planta) {
        plantas.add(planta);
    }

    public void simular() {
        System.out.println("Simulação do ecossistema:");

        for (Animal animal : animais) {
            animal.mover();
            animal.comer();
        }

        for (Fenomeno fenomeno : fenomenos) {
            fenomeno.ocorrer();
        }
    }
}
