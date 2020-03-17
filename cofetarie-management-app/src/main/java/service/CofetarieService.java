package service;

import model.Client;
import model.Cofetarie;
import model.EvenimentSpecial;
import model.ProdusCofetarie;

public class CofetarieService {
    //obiectul trebuie initializat
    private Cofetarie cofetariaMea = new Cofetarie();

    public void adaugaClient(Client clientNou) {
        cofetariaMea.getListaClienti().add(clientNou);
    }

    public void adaugaProdusCofetarie(ProdusCofetarie produsNou) {
        cofetariaMea.getListaProduseCofetarie().add(produsNou);
    }

    public void adaugaEvenimentSpecial(EvenimentSpecial evenimentNou) {
        cofetariaMea.getListaEvenimenteSpeciale().add(evenimentNou);
    }

    public void afiseazaListaClientiCofetarie() {
        for (Client clientDinCofetarie : cofetariaMea.getListaClienti()) {
            System.out.println(clientDinCofetarie);
        }
    }

    public void afiseazaNumarClientiExistenti() {
        System.out.println("Cofetaria mea are " +
                cofetariaMea.getListaClienti().size() + " clienti");
    }

    public void afiseazaListaProduseCofetarie() {
        for (ProdusCofetarie produsDinCofetariaMea : cofetariaMea.getListaProduseCofetarie()) {
            System.out.println(produsDinCofetariaMea);
        }
    }

    public void afiseazaNumarProduseCofetarieExistente() {
        System.out.println("Cofetaria mea are " +
                cofetariaMea.getListaProduseCofetarie().size() + " produse");
    }

    public void afiseazaListaEvenimenteSpecialeCofetarie() {
        for (EvenimentSpecial evenimentSpecialDinCofetariaMea : cofetariaMea.getListaEvenimenteSpeciale()) {
            System.out.println(evenimentSpecialDinCofetariaMea);
        }
    }

    public void afiseazaNumarEvenimenteSpecialeCofetarie() {
        System.out.println("Cofetarie mea are " +
                cofetariaMea.getListaEvenimenteSpeciale().size() + " evenimente speciale");
    }
}
