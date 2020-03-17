package java101;

public class FunctiiMatematice101 {
    public static void main(String[] args) {
        double x = sumaA2Nr(2, 3);
        System.out.println(x);
        System.out.println(sumaA2Nr(2, 3));
        System.out.println(sumaA2Nr(5, 8));
//        diferentaA2Nr(4, 8);
//        inmultireaA2Nr(7, 6);
//        impartireaA2Nr(99.9, 3);
    }
//    public static void sumaA2Nr(double a, double b) {
//        System.out.println(a + b);
//    }

    public static double sumaA2Nr(double a, double alDoileaNumar) {
        double suma = a + alDoileaNumar;
        return suma;
    }

    public static void ceva(String x, int nr) {
    }

    public static void diferentaA2Nr(double a, double b) {
        System.out.println(a - b);
    }

    public static void inmultireaA2Nr(double a, double b) {
        System.out.println(a * b);
    }

    public static void impartireaA2Nr(double a, double b) {
        System.out.println(a / b);
    }


}
