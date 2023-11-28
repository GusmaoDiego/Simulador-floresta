package com.ecossistema.plantas;

public class Grama extends Planta {
    public Grama(String nome) {
        super(nome);
    }

    @Override
    public void crescer() {
        System.out.println("A grama cresce rapidamente e se espalha pelo terreno.");
    }

    @Override
    public void reproduzir() {
        System.out.println("A grama se reproduz através de sementes e rizomas.");
    }
}
