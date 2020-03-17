package colectii;

import colectii.ArrayList.ExempluArrayLists;
import mostenire.Om;

public class ArrayListExecutie {

    public static void main(String[] args) {

        String numeSef1 = "Cristi";
        String numeSef2 = "Cosmin";
        String numeSef3 = "Razvan";
        String numeSef4 = "Robert";

        Om omExtraordinar1 = new Om();
        omExtraordinar1.setNume("Einstein");
        omExtraordinar1.setVarsta(32);
        Om omExtraordinar2 = new Om();
        omExtraordinar2.setNume("Curie");
        omExtraordinar2.setVarsta(32);


        ExempluArrayLists listaNumeOameni = new ExempluArrayLists();

        listaNumeOameni.adaugaNumeOmInListaSefi(numeSef1);
        listaNumeOameni.adaugaNumeOmInListaSefi(numeSef2);
        listaNumeOameni.adaugaNumeOmInListaSefi(numeSef3);
        listaNumeOameni.adaugaNumeOmInListaSefi(numeSef4);

        listaNumeOameni.afiseazaNumeOameniDinListaDeSefi();

        System.out.println("=============\n" +
                "=============");

        listaNumeOameni.adaugaOmExtraordinarInLista(omExtraordinar1);
        listaNumeOameni.adaugaOmExtraordinarInLista(omExtraordinar2);

        listaNumeOameni.afisareListaOameniExtraordinari();
    }
    //{"Einstein",32}
    // {"Curie",32}
}
