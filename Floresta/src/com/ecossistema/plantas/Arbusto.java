package com.ecossistema.plantas;

public class Arbusto extends Planta {
    public Arbusto(String nome) {
        super(nome);
    }

    @Override
    public void crescer() {
        System.out.println("O arbusto cresce em altura moderada.");
    }

    @Override
    public void reproduzir() {
        System.out.println("O arbusto se reproduz através de brotos.");
    }
}
