package java101;

import java.util.Scanner;

public class LaturiTriunghi {

    public static void main(String[] args) {
        System.out.println("Program care determina daca 3 numere pot constitui laturile unui triunghi si tipul acestuia");

        int latura1, latura2, latura3;

        Scanner citireDeLaTastatura = new Scanner(System.in);

        System.out.println("Lungime prima latura ");
        latura1 = citireDeLaTastatura.nextInt();
        System.out.println("Lungime latura 2 ");
        latura2 = citireDeLaTastatura.nextInt();
        System.out.println("Lungime latura 3 ");
        latura3 = citireDeLaTastatura.nextInt();

        // verificare laturi mai mare decat 0
        if (latura1 > 0 && latura2 > 0 && latura3 > 0) {
            //verificare daca laturi respecta conditie matematica
            if (latura1 + latura2 > latura3 ||
                    latura2 + latura3 > latura1 ||
                    latura1 + latura3 > latura2) {
                //verificare triunghi echilateral
                if (latura1 == latura2 && latura2 == latura3) {
                    System.out.println("Triunghiul este echilateral");
                } else {
                    //verificare triunghi isoscel
                    if (latura1 == latura2 ||
                            latura2 == latura3 ||
                            latura1 == latura3) {
                        System.out.println("Triunghiul este isoscel");
                    } //daca triunghiul nu este isoscel inseamna ca este oarecare
                    else {
                        System.out.println("Triunghiul este oarecare");
                    }
                }
            } //daca nu se respecta conditia matematica
            else {
                System.out.println("Valorile introduse nu pot " +
                        "constitui laturile unui triunghi");
            }
        } // daca nu se respecta ca valorile sa fie mai mari decat 0
        else {
            System.out.println("Valorile introduse nu pot " +
                    "constitui laturile unui triunghi");
        }

    }
}
