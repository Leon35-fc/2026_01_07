package es2;

import java.util.Scanner;

public class es2 {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Scrivi un numero da 0 a 3");
        int num = scn.nextInt();
        System.out.println(numToWord(num));
    }

    public static String numToWord(int input) {
        //  scn.nextLine(); // per consumare il newline
        int num = input;
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

