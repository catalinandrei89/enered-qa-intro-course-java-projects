package java101;

import java.util.Scanner;

public class StructuraWhile {

    public static void main(String[] args) {
        System.out.println("Program care afiseaza de la 0 la n cu pas 2");

        Scanner scanner = new Scanner(System.in);
        System.out.println("dati pana la cat vreti sa numarati");
        int n = scanner.nextInt();
        int i = 0;
        while (i <= n) {
            System.out.println(i);
            i += 3;
        }


        for (int j = 0; j <= n; j += 2) {
            System.out.println(j);
        }



    }
}
