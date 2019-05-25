package com;

import com.company.Auto;
import com.company.ScreenReader;
import com.company.ScreenWriter;

class MainClass {

    public static void main(String[] args) {
        Auto audi = new Auto("Audi");
        audi.ilośćKół = 4;

        Auto mercedes = new Auto("Mercedes");
        mercedes.ilośćKół = 6;

        Auto[] stanKomisu = {audi, mercedes};

        Auto kliknieteAuto = stanKomisu[1];

        System.out.println("Auto: " + audi.nazwaAuta + " ma " + audi.ilośćKół + " kóła");
        System.out.println("Auto: " + mercedes.nazwaAuta + " ma " + mercedes.ilośćKół + " kóła");

        audi.wypiszTeAuto();
        audi.wypiszIlośćKół();
//        wypiszAuto(audi);
//        wypiszAuto(mercedes);
        String login = ScreenReader.readConsoleInput();
        ScreenWriter.wypiszTekst("Tekst");
    }

    public static void wypiszAuto(Auto auto) {
        System.out.println("Te auto ma liczbe kół = " + auto.ilośćKół);
    }
}
