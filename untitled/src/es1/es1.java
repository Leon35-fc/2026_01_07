package es1;

import java.util.Scanner;

public class es1 {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Scrivi una parola");
        String word = scn.nextLine();
        System.out.println(stringaPariDispari(word));
        System.out.println("Inserisci un anno");
        int year = scn.nextInt();
        System.out.println(annoBisestile(year));

    }

    public static boolean stringaPariDispari(String word) {
        System.out.println("Il numero di lettere è pari?");
        return word.length() % 2 == 0;
    }

    public static boolean annoBisestile(int year) {
        int anno = year;
        System.out.println("È un anno bisestile?");
        if (anno % 4 == 0 && anno % 100 != 0) {
            return true;
        } else {
            return anno % 100 == 0 && anno % 400 == 0;
        }
    }
}



