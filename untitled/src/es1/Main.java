package es1;

import java.util.Scanner;

public class Main {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {

            System.out.println(stringaPariDispari());
            System.out.println(annoBisestile());

    }

        public static boolean stringaPariDispari() {
            System.out.println("Scrivi una parola");
            String word = scn.nextLine();
            return word.length()%2 == 0;
        }

        public static boolean annoBisestile(){
            System.out.println("Inserisci un anno");
            int anno = scn.nextInt();
            if ( anno%4 == 0 && anno%100 != 0){
                return true;
            }else{
                return anno % 100 == 0 && anno % 400 == 0;
            }
        }
}



