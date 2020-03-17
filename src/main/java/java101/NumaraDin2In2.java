package java101;

public class NumaraDin2In2 {

    public static void main(String[] args) {
        System.out.println("Program care numara din 2 in 2 pana la 10");


        //numara crescator
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }

        //numara descrescator
        for (int i = 10; i >= 0; i -= 2) {
            System.out.println(i);
        }
    }
}
