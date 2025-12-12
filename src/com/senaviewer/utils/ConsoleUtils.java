package com.senaviewer.utils;

import java.util.Scanner;

public final class ConsoleUtils {
    private static final Scanner sc = new Scanner(System.in);

    private ConsoleUtils() {}

    public static String readLine(String prompt) {
        System.out.print(prompt + ": ");
        return sc.nextLine().trim();
    }

    public static int readInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt + ": ");
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Intenta de nuevo.");
            }
        }
    }
}
