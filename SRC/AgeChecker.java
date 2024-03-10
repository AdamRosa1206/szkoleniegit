// Zapytaj użytkownika o wiek gsy ma mniej niż 18 lat wypisz na ekranie
// informacje że nie może kupić alokoholu gdy ma więcej niż 18 lat podziekuj za zakupy

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner agechecker = new Scanner(System.in);
        System.out.println("Podaj swój wiek");
        int age = agechecker.nextInt();
        if (age < 18 && age >= 0) {
            System.out.println("Nie mozesz kupic alkoholu");
        } else if (age < 0) {
            System.out.println("Podaj poprawną wartosc");
        } else {
            System.out.println("Dziękujemy za zakupy w naszym sklepie");
        }
    }
}
