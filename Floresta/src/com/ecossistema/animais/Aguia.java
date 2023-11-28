package com.ecossistema.animais;

public class Aguia extends Animal {
    public Aguia(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void mover() {
        System.out.println("A águia voa majestosamente nos céus.");
    }

    @Override
    public void comer() {
        System.out.println("A águia caça suas presas no ar e na terra.");
    }
}
