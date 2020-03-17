package polimorfism;

public class Executie {

    public static void main(String[] args) {

        Numere x = new Numere();

        System.out.println(x.sumaNumerelor(2, 5)); ;
        System.out.println(x.sumaNumerelor(5, 8, 9, 2));  ;
        System.out.println(x.sumaNumerelor(3.2, 6.9)); ;
        System.out.println(x.sumaNumerelor(5.2, 3)); ;
        System.out.println(x.sumaNumerelor(3, 5.2)); ;
        System.out.println(x.sumaNumerelor(6.2, 5.2)); ;
        System.out.println(x.sumaNumerelor(5.2, 3, 9.2)); ;
        System.out.println(x.sumaNumerelor(2.9, 9)); ;
        System.out.println(x.metodaOverride(2,9.2,8.9));
        //2*9.2+9.2*8.9+2*8.9=18.4+81.88+17.8

        NumereSpeciale xy = new NumereSpeciale();
        System.out.println(xy.metodaOverride(2,9.2,8.9));;
        //2-9.2-8.9=-16.1

    }
}
