package polimorfism;

public class NumereSpeciale extends Numere {


    double metodaOverride(int a, double x, double y) {
        double rezultat = a - x - y;
        return rezultat;
    }
}
