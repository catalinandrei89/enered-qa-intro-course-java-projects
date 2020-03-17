package java101;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        int numarCititTastatura;
        int nrInitial;
        int palindrom = 0;
        int ultimaCifra;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati numarul!");
        numarCititTastatura = scanner.nextInt();
        nrInitial = numarCititTastatura;

        if (numarCititTastatura > 9) {
            // for (; numarCititTastatura != 0; )

            while (numarCititTastatura != 0) {
                ultimaCifra = numarCititTastatura % 10;
                palindrom = palindrom * 10 + ultimaCifra;
                numarCititTastatura = numarCititTastatura / 10;
            }
            if (nrInitial == palindrom) {
                System.out.println("Numarul este palindrom");
            } else {
                System.out.println("Numarul nu este palindrom");
            }
        } else {
            System.out.println("Numarul are o singura cifra!");
        }
    }
}
