package colectii.ArrayList;

import mostenire.Om;

import java.util.ArrayList;

public class ExempluArrayLists {

    private ArrayList<String> listaSefi = new ArrayList<String>();

    public void adaugaNumeOmInListaSefi(String numeOm) {
        listaSefi.add(numeOm);
    }

    public void afiseazaNumeOameniDinListaDeSefi() {
        //for(int i=0;i<listaSefi.size();i++) - gresit
        for (String numeSef : listaSefi) {
            System.out.println(numeSef);
        }
    }

    private ArrayList<Om> listaOameniExtraordinari = new ArrayList<Om>();

    public void adaugaOmExtraordinarInLista(Om nouOmExtraordinar) {
        listaOameniExtraordinari.add(nouOmExtraordinar);
    }

    public void afisareListaOameniExtraordinari() {
        //for (int i = 0; i < listaOameniExtraordinari.size(); i++)
        for(Om omExtraordinar : listaOameniExtraordinari) {
            System.out.println(omExtraordinar);
        }
    }
}
