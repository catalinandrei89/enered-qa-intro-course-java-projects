package java101;

public class Functie1 {
    public static void main(String[] args) {
        int a = 2, b = 3;
        double n = 4.2, m = 5.8;
        // suma(2, 3);
        suma(a, b);
        suma(n, m);
        ;
        suma(22.9, 99.8);
        suma(2, 99.9);
        suma(2, 5, 99.9);
    }


    public static void suma(double x, double y) {
        double sumaNr = x + y;
        System.out.println(sumaNr);
    }

    public static void suma(double x, double y, double z) {
        double sumaNr = x + y + z;
        System.out.println(sumaNr);
    }
}
