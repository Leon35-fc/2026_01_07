package es4;

import java.util.Scanner;

public class Main {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(contdown());

    }
    public static int contdown(){
        System.out.println("Scrivi un numero.");
        String ctnInp = scn.nextLine();
        int ctn = Integer.parseInt(ctnInp);
        for( int i = 0; ctn >0; i++){
            ctn--;
            System.out.println(ctn);
        }
        return ctn;
    }
}
