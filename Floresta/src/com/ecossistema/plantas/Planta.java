package com.ecossistema.plantas;

public abstract class Planta {
    protected String nome;

    public Planta(String nome) {
        this.nome = nome;
    }

    public abstract void crescer();

    public abstract void reproduzir();
}
