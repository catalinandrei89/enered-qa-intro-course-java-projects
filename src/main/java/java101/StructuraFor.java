package java101;

import java.util.Scanner;

public class StructuraFor {

    public static void main(String[] args) {
        System.out.println("Program care afiseaza de la 0 la n cu pas 2");

        Scanner scanner = new Scanner(System.in);
        System.out.println("dati pana la cat vreti sa numarati");
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i += 2) {
            System.out.println(i);
        }

        //i nu are grad de vizibilitate in afara blocului de control for
        //System.out.println(i);
//        String[] eleviClasa = {"Ana", "Mircea", "Florin"};
//        int dimensiuneEleviClasa = eleviClasa.length;
//        for(int i=0;i<dimensiuneEleviClasa;i++)
//        {
//            System.out.println(eleviClasa[i]);
//        }
    }
}
