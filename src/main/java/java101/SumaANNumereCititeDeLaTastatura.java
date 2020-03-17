package java101;

import java.util.Scanner;

public class SumaANNumereCititeDeLaTastatura {

    public static void main(String[] args) {
        System.out.println("Program care calculeaza suma a n numere citite de la tastatura");

        int suma = 0, valoareCitita, numereCitite;
        Scanner citireDeLaTastatura = new Scanner(System.in);
        System.out.println("Cate numere vreti sa cititi de la tastatura?");
        numereCitite = citireDeLaTastatura.nextInt();
        for (int contor = 0; contor < numereCitite; contor++) {
            System.out.println("Dati un numar ");
            valoareCitita = citireDeLaTastatura.nextInt();
            suma = suma + valoareCitita;
        }

        System.out.println("Suma numerelor citite de la tastatura este "
                + suma);
       // System.out.println("valoare contorului este " + contor);
    }

}
