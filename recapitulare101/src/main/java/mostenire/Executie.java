package mostenire;

public class Executie {

    public static void main(String[] args) {

        Om x = new Om();
        x.setVarsta(22);
        x.setNume("Cristi");
        x.afisareInformatiiOm();
        x.setNume("dragos");

        Copil dragalasu = new Copil();
        dragalasu.setVarsta(8);
        dragalasu.setNume("Albert");
        dragalasu.setScoala("National");
        dragalasu.afisareInformatiiUndeInvataCopil();
        dragalasu.afisareInformatiiOm();


        dragalasu.getScoala();

    }
}
