package com.ecossistema.ecossistema;

import com.ecossistema.fenomenos.Fenomeno;

public class Chuva extends Fenomeno {
    @Override
    public void ocorrer() {
        System.out.println("A chuva começa a cair, fornecendo água às plantas e animais.");
    }
}
