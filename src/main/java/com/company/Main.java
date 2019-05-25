package com.company;

import java.util.Scanner;

public class Main {

    // zadanie 1 - choinka

    public static void main1(String[] args) {

        char c = '*';

        // kod Artur
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        char c = '*';
        int dlugosc = 10;

        // kod Artur
        for (int i = 0; i < dlugosc; i++) {

            for (int j = 0; j < dlugosc - i; j++) {
                System.out.print(" ");
            }

            for (int j = (dlugosc / 2) - i; j <= (dlugosc / 2) + i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

//     zadanie 2 - logowanie

    public static void main2(String[] args) {
        System.out.print("Login:");
        Scanner scanner = new Scanner(System.in);
        String odczytLogin = scanner.next();

        boolean czyOKlogin = odczytLogin.equals("Admin");

        if (czyOKlogin == true) {
            System.out.println("Login prawidłowy");
        } else {
            System.out.println("Błędny login, sporóbuj jeszcze raz");
        }

        System.out.println("Hasło:");
        String odczytHaslo = scanner.next();

        boolean czyOKhaslo = odczytHaslo.equals("1234");

        if (czyOKhaslo == true) {
            System.out.println("Hasło prawidłowe");
        } else {
            System.out.println("Błędne hasło, spróbuj jeszcze raz");
        }
    }
}

// kod Magda
