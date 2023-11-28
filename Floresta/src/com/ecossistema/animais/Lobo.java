package com.ecossistema.animais;

public class Lobo extends Animal {
    public Lobo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void mover() {
        System.out.println("O lobo se move rapidamente.");
    }

    @Override
    public void comer() {
        System.out.println("O lobo caça suas presas para se alimentar.");
    }
}
