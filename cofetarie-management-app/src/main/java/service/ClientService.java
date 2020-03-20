package service;

import model.Client;
import model.ProdusCofetarie;

import java.util.ArrayList;

public class ClientService {

    private double sumaDePlatit = 0;
    private Client clientulMeu = new Client();

    public void adaugareProdusCofetarieInCosulDeCumparaturi(ProdusCofetarie produsCofetarieNou) {
        clientulMeu.getListaProduseCofetarieClient().add(produsCofetarieNou);
        System.out.println("Produsul adaugat are pretul de " + produsCofetarieNou.getPretProdusCofetarie() + " RON");
    }

    public void afisarePretCosCumparaturi() {
        ArrayList<ProdusCofetarie> produseleClientuluiDinCos = clientulMeu.getListaProduseCofetarieClient();
        for (ProdusCofetarie produsIndividualDinCos : produseleClientuluiDinCos) {
            double pretProdusIndividual = produsIndividualDinCos.getPretProdusCofetarie();
            sumaDePlatit = sumaDePlatit + pretProdusIndividual;
            //sumaDePlatit += pretProdusIndividual;
            //sumaDePlatit += produsIndividualDinCos.getPretProdusCofetarie();
        }
        System.out.println("Suma finala de platit este " + sumaDePlatit + " RON");
    }

}
