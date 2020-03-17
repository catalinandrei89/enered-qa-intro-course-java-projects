import mostenire.Angajat;
import mostenire.Om;

public class Executie {

    public static void main(String[] args) {

//        Telefon x = new Telefon();
//        //x.procentBaterie=90;
//        x.setCuloare("albastru");
//        System.out.println(x.getCuloare());
//
//        Telefon m = Telefon.builder()
//                .culoare("galben")
//                .dimensiuneDisplay(6.5)
//                .grosimeTelefon(6.5)
//                .numeProcesor("Snapdragon 985")
//                .pret(6499.99)
//                .procentBaterie(80)
//                .build();
//
//        Telefon naspa = new Telefon();
//        naspa.setNumeProducator("Samsung");
//        naspa.setModelTelefon("20 Ultra");
//
//
//        Telefon sfrijit = Telefon.builder()
//                .culoare("albastru")
//                .pret(29.99)
//                .dimensiuneDisplay(99.9)
//                .build();

//////////////////
        /////////////
        ////////////


        Om cristi = new Om();
        cristi.setPrenume("Cristi");
        cristi.setNume("Popescu");
        cristi.setAnulNasterii(1990);
        cristi.setInaltime(1.88);
        cristi.setAdresa("Iasi");
        cristi.calculeazaVarsta();


        Angajat stefan = new Angajat();
        stefan.setAnulNasterii(1990);
        stefan.calculeazaVarsta();
    }
}