package com.company;

import java.util.Scanner;

public class ScreenReader {

    public static String readConsoleInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
