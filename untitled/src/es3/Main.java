package es3;

import java.util.Scanner;

public class Main {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(strToChar());

    }

    public static String strToChar(){
        System.out.println("Scrivi una parola");
        String word = scn.nextLine();
        String str = "";
        while(word != ":q") {
        for(int i=0; i < (word.length() * 2); i++){
            str += word.charAt(i) + ",";
            }
        }
        System.out.println("exit");
        return str;
    }
}
