package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Whats up?");

        int zahl1 = 5;
        int zahl2 = 10;
        int ergebnis = zahl1 + zahl2;
        System.out.println("Summe: " + ergebnis);
        int ergebnis2 = zahl2 - zahl1;
        int ergebnis3 = zahl1 * zahl2;
        int ergebnis4 = zahl2 / zahl1;

        if (zahl1 > zahl2) {
            System.out.println("Zahl 1 ist größer als Zahl 2");
        } else {
            System.out.println("Zahl 2 ist größer als Zahl 1");
        }

        if (zahl1 == zahl2) {
            System.out.println("Zahl 1 ist gleich Zahl 2");
        } else {
            System.out.println("Zahl 1 ist ungleich Zahl 2");
        }

        double zahl3 = 5.0;
        float zahl4 = 10.0f;
        double ergebnis5 = zahl3 + zahl4;
        double ergebnis6 = zahl4 - zahl3;
        double ergebnis7 = zahl3 * zahl4;
        double ergebnis8 = zahl4 / zahl3;

        if (zahl3 > zahl4) {
            System.out.println("Zahl 3 ist größer als Zahl 4");
        } else {
            System.out.println("Zahl 4 ist größer als Zahl 3");
        }

        if (zahl3 == zahl4) {
            System.out.println("Zahl 3 ist gleich Zahl 4");
        } else {
            System.out.println("Zahl 3 ist ungleich Zahl 4");
        }

        int [] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        System.out.println(array[0]);
        System.out.println(array[2]);
        int ergebnisArray = array[0] + array[1];
        System.out.println(array.length);
    }
}