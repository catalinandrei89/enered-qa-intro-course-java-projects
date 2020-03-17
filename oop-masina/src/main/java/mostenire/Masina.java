package mostenire;

import lombok.Data;

import java.util.Calendar;
import java.util.Scanner;

@Data
public class Masina {

    private int anulFabricatiei;
    private double consum;
    private String numeProducator;
    private String model;
    private double pretBaza;
    private double capacitateCilindrica;
    private int caiPutere;
    private String culoare;

    public void calculeazaVechimeMasina() {
        int anulCurent = Calendar.getInstance().get(Calendar.YEAR);
        int varstaMasina = anulCurent - anulFabricatiei;
        System.out.println("Masina are o vechime de " + varstaMasina);
    }

    public void preluareLeasing() {

    }

    public void asigurareMasina() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati tipul de asigurare pe care doriti sa-l aveti!");
        System.out.println("Optiunile sunt: " +
                "\n 1. CASCO" +
                "\n 2. RCA" +
                "\n 3. RCA + incediu" +
                "\n 4. RCA + furt" +
                "\n 5. RCA + geamuri" +
                "\n Introduceti optiunea 1-5");
        int tipAsiguarere = scanner.nextInt();
        System.out.println("Pe cat timp doriti sa faceti asigurarea? " +
                "\n 1. 6 luni" +
                "\n 2. 12 luni" +
                "\n Introduceti optiunea 1-2");
        int perioadaAsigurare = scanner.nextInt();
        switch (tipAsiguarere) {
            case (1):
                if (perioadaAsigurare == 1) {
                    System.out.println("Ai ales asigurare de tip CASCO pe 6 luni");
                } else {
                    if (perioadaAsigurare == 2) {
                        System.out.println("Ai ales asigurare de tip CASCO pe 12 luni");
                    } else {
                        System.out.println("Asigurare indisponibila");
                    }
                }
                break;
            case (2):
                if (perioadaAsigurare == 1) {
                    System.out.println("Ai ales asigurare de tip RCA pe 6 luni");
                } else {
                    if (perioadaAsigurare == 2) {
                        System.out.println("Ai ales asigurare de tip RCA pe 12 luni");
                    } else {
                        System.out.println("Asigurare indisponibila");
                    }
                }
                break;
            case (3):
                if (perioadaAsigurare == 1) {
                    System.out.println("Ai ales asigurare de tip RCA + incediu pe 6 luni");
                } else {
                    if (perioadaAsigurare == 2) {
                        System.out.println("Ai ales asigurare de tip RCA + incediu pe 12 luni");
                    } else {
                        System.out.println("Asigurare indisponibila");
                    }
                }
                break;
            case (4):
                if (perioadaAsigurare == 1) {
                    System.out.println("Ai ales asigurare de tip RCA + furt pe 6 luni");
                } else {
                    if (perioadaAsigurare == 2) {
                        System.out.println("Ai ales asigurare de tip RCA + furt pe 12 luni");
                    } else {
                        System.out.println("Asigurare indisponibila");
                    }
                }
                break;
            case (5):
                if (perioadaAsigurare == 1) {
                    System.out.println("Ai ales asigurare de tip RCA + geamuri pe 6 luni");
                } else {
                    if (perioadaAsigurare == 2) {
                        System.out.println("Ai ales asigurare de tip RCA + geamuri pe 12 luni");
                    } else {
                        System.out.println("Asigurare indisponibila");
                    }
                }
                break;
            default:
                System.out.println("Tip de asigurare indisponibil");
                break;
        }
    }
}
