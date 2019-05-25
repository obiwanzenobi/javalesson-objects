package com.company;

public class Auto {
    public String nazwaAuta;
    public int ilośćKół;

    public Auto(String nazwa) {
        nazwaAuta = nazwa;
        wypiszIlośćKół();
    }

//    public int dodaj(int a, int b) {
//        return a + b;
//    }

    public void wypiszTeAuto() {
        wypiszIlośćKół();
        wypiszNazweAuta();
    }

    public void wypiszIlośćKół() {
        System.out.println("Ilość opon: " + ilośćKół);
    }

    private void wypiszNazweAuta() {
        System.out.println("Nazwa auta: " + nazwaAuta);
    }
}
