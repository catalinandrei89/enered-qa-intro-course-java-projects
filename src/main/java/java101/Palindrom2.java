package java101;

import java.util.Scanner;

public class Palindrom2 {

    public static void main(String[] args) {
        int nrCititTastatura, aux, ultimaCifra = 0, palindrom = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati un nr de verificat daca este palindrom sau nu");
        nrCititTastatura = scanner.nextInt();

        aux = nrCititTastatura;
        while (nrCititTastatura != 0) {
            ultimaCifra = nrCititTastatura % 10;
            nrCititTastatura = nrCititTastatura / 10;
            // nrCititTastatura/=10;
            palindrom = palindrom * 10 + ultimaCifra;
        }
        if (aux == palindrom) {
            System.out.println("numarul " + aux + " este palindrom");
        } else {
            System.out.println("Numarul " + aux + " nu este palindrom");
        }
    }
}
