package es4;

import java.util.Scanner;

public class es4 {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Scrivi un numero.");
        String cntStart = scn.nextLine();
        System.out.println(contdown(cntStart));

    }

    public static int contdown(String cntStart) {
        int ctn = Integer.parseInt(cntStart);
        for (int i = 0; ctn > 0; i++) {
            ctn--;
            System.out.println(ctn);
        }
        return ctn--;
    }
}
