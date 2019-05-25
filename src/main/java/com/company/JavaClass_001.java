package com.company;
// zadanie 1
// wypisz choinke pętlą
//   *
//  ***
// *****


public class JavaClass_001 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int choina = 0; choina <= i; choina++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// zadanie 2
// pokazac wiadomosc powitalna po logowaniu
// logowanie to przyjecie dwoch stringow i sprawdzeniu czy to admin - password

//import java.util.Scanner;                     //<- odznaczone * zeby 2 zadania były w 1 pliku
//
//public class JavaClass_001 {
//
//    public static void main(String args[]) {
//
//        String nazwaUzytkownika;
//        String hasloUzytkownika;
//
//        nazwaUzytkownika = "admin";
//        hasloUzytkownika = "admin123";
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Wprowadz nazwe uzytkownika:");
//        String login = scanner.next();
//
//        System.out.println("Wprowadz haslo");
//        String haslo = scanner.next();
//
//        if (login.equals(nazwaUzytkownika) && haslo.equals(hasloUzytkownika)) {
//            System.out.println("Wprowadzono poprawna nazwe uzytkownika i haslo");
//        } else if (login.equals((nazwaUzytkownika))) {
//            System.out.println("Wprowadzono zle haslo");
//        } else if (haslo.equals((hasloUzytkownika))) {
//            System.out.println("Wprowadzono zla nazwe uzytkownika");
//        } else {
//            System.out.println("Nieprawidlowa nazwa uzytkownika i haslo");
//        }
//    }
//}
//
//
//
