package polimorfism;

public class Numere {

    int sumaNumerelor(int primulNumar, int b) {
        int suma = primulNumar + b;
        return suma;
    }

    int sumaNumerelor(int a, int b, int c) {
        int suma = a + b + c;
        return suma;
    }

    double sumaNumerelor(double a,double b, double c) {
        double suma = a+b+c;
        return suma;
    }

    double sumaNumerelor(double a, double b) {
        double suma = a + b;
        return suma;
    }

    double sumaNumerelor(double a, int b) {
        double suma = a + b;
        return suma;
    }


    double sumaNumerelor(double a, double b, double c, double d) {
        double rezultat = 1;
        rezultat = a * b * c * d;
        return rezultat;
    }

    double metodaOverride (int a, double x, double y) {
        double rezultat=1;
        rezultat = a*x+x*y+a*y;
        return rezultat;
    }

}
