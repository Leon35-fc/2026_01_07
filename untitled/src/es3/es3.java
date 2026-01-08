package es3;

import java.util.Scanner;

public class es3 {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Scrivi una parola");
        System.out.println(strToChar());

    }

    public static String strToChar() {
        String str = "";
        String word = "";
        while (!word.equals(":q")) {
            word = scn.nextLine();
            for (int i = 0; i < word.length(); i++) {
                str += word.charAt(i) + (i != word.length() - 1 ? "," : "");
            }
            System.out.println(str);
            System.out.println("Scrivi una nuova parola");
            str = "";
        }
        System.out.println("exit");
        return str;
    }
}
