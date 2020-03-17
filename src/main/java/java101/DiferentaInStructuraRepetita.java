package java101;

import java.util.Scanner;

public class DiferentaInStructuraRepetita {

    public static void main(String[] args) {
        int a, b;
        int diferentaNumerelor;
        Scanner prastie = new Scanner(System.in);
        System.out.println("Dati primul numar ");
        a = prastie.nextInt();
        System.out.println("Dati al 2lea numar ");
        b = prastie.nextInt();

        //verificare daca a sau b este mai mare
        if (a > b) {
            diferentaNumerelor = a - b;
            for (int i = 0; i < diferentaNumerelor; i++) {
                System.out.println(diferentaNumerelor);
            }
        } else {
            diferentaNumerelor = b - a;
            for (int i = 0; i < diferentaNumerelor; i++) {
                System.out.println("-" + diferentaNumerelor);
            }
        }


        if (a < 0 && b < 0) {
            diferentaNumerelor = a - b;
            for (int i = 0; i < diferentaNumerelor; i++) {
                System.out.println(diferentaNumerelor);
            }
        }

        if (a < 0) {
            diferentaNumerelor = -a + b;
            for (int i = 0; i < diferentaNumerelor; i++) {
                System.out.println("-" + diferentaNumerelor);
            }
        } else {
            for (int i = 0; i < diferentaNumerelor; i++) {
                System.out.println(diferentaNumerelor);
            }
        }
    }
}
