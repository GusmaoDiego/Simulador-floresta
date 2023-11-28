package com.ecossistema.animais;

public class Coelho extends Animal {
    public Coelho(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void mover() {
        System.out.println("O coelho pula pelo terreno.");
    }

    @Override
    public void comer() {
        System.out.println("O coelho se alimenta de vegetação.");
    }
}
