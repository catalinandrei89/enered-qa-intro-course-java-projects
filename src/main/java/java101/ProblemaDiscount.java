package java101;

import java.util.Scanner;

public class ProblemaDiscount {

    public static void main(String[] args) {
        boolean clientFidel;
        double pretFinal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati nume om");
        String numeOm = scanner.nextLine();
        System.out.println("Dati discount");
        double discount = scanner.nextDouble();
        System.out.println("Dati pret initial");
        double pretInitial = scanner.nextDouble();

        System.out.println("Este clientul fidel? ");
        Scanner scanner1 = new Scanner(System.in);
        String raspuns = scanner1.nextLine();

        if (raspuns.equals("DA")) {
            clientFidel = true;
            pretFinal = pretInitial - (pretInitial * discount) / 100;
        } else {
            clientFidel = false;
            pretFinal = pretInitial;
        }

        System.out.println("Pretul pe care il va plati " + numeOm + " este " + pretFinal);
    }
}
