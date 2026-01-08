package es2;

import java.util.Scanner;

public class es2 {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(numToWord());
    }

    public static String numToWord() {
        System.out.println("Scrivi un numero da 0 a 3");
        int num = scn.nextInt();
        scn.nextLine(); // per consumare il newline

        switch (num) {
            case 0:
                return "zero";
            case 1:
                return "uno";
            case 2:
                return "due";
            case 3:
                return "tre";
            default:
                return "Valore errato";
        }
    }
}

