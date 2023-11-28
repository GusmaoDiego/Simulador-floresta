package com.ecossistema.plantas;

public class Arvore extends Planta {
    public Arvore(String nome) {
        super(nome);
    }

    @Override
    public void crescer() {
        System.out.println("A árvore cresce lentamente ao longo dos anos.");
    }

    @Override
    public void reproduzir() {
        System.out.println("A árvore produz sementes para se reproduzir.");
    }
}
