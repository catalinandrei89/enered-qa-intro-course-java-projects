package java101;

import java.util.Scanner;

//problema care rezolva interschimbarea a 2 variabile
public class InterschimbareA2Variabile {

    public static void main(String[] args) {
        int x = 2, y = 3;
        interschimbareV1(x, y);
        interschimbareV2(x, y);
        interschimbareV3(x, y);
        interschimbareV4(x, y);
        interschimbareV5();
    }

    private static void interschimbareV1(int a, int b) {
        System.out.println("V1: Interschimbare cu ajutorul unei variabile suplimentare");
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("Valorea finala a lui a este " + a + " si a lui b este " + b);
    }

    private static void interschimbareV2(int a, int b) {
        System.out.println("V2: Interschimbare prin operatii matematice: 1. adunare si scadere");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Valorea finala a lui a este " + a + " si a lui b este " + b);
    }

    private static void interschimbareV3(int a, int b) {
        System.out.println("V3: Interschimbare prin operatii matematice: 2. inmultire si impartire");
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("Valorea finala a lui a este " + a + " si a lui b este " + b);
    }


    private static void interschimbareV4(int a, int b) {
        System.out.println("V4: Interschimbare prin lucru pe biti - XOR");
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Valorea finala a lui a este " + a + " si a lui b este " + b);
    }

    private static void interschimbareV5() {
        System.out.println("V5: Interschimbare cu citire de la tastatura si operatii matematice de adunare si scadere");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dati primul nr: ");
        int a = scanner.nextInt();
        System.out.print("Dati al 2lea nr: ");
        int b = scanner.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Valorea finala a lui a este " + a + " si a lui b este " + b);
    }

}
