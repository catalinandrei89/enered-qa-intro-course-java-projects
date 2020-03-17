package java101;

import java.util.Scanner;

public class FunctiaGrad1V2 {


    public static void main(String[] args) {
        System.out.println("Program care calculeaza " +
                "functia de gradul 2, versiunea 2");

        //int primulNumar;// declarare
        //int alDoileaNumar;
        double solutieEcuatieGrad1 = 0; //initializare

        Scanner citireDeLaTastatura =
                new Scanner(System.in);
        System.out.println("Dati primul numar: ");
        int primulNumar = citireDeLaTastatura.nextInt();

        System.out.println("Dati al 2lea numar: ");
        int alDoileaNumar = citireDeLaTastatura.nextInt();

        solutieEcuatieGrad1 = -alDoileaNumar / primulNumar;
        System.out.format("Solutia pentru ecuatia de gradul I de tip " + primulNumar + "x+" +
                alDoileaNumar + "=0 este \nx=%.2f", solutieEcuatieGrad1);

    }
}
