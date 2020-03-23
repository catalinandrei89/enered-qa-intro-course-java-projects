import model.Client;
import model.EvenimentSpecial;
import model.ProdusCofetarie;
import service.ClientService;
import service.CofetarieService;

import java.util.Scanner;

public class ExecutieCofetarieManagementApp {

    public static void main(String[] args) {
        CofetarieService cofetarieService = new CofetarieService();
        ClientService clientService = new ClientService();

//        cofetarieService.creareCofetarie();
//        cofetarieService.afisareInformatiiCofetarie();
//        cofetarieService.schimbareAdresaCofetarie();



        //adaugam Evenimente
//        EvenimentSpecial evenimentSpecialTest10 = EvenimentSpecial.builder()
//                .numeEveniment("Botez")
//                .durataEveniment(15)
//                .pretEveniment(1500)
//                .tematicaEveniment("la alegere")
//                .build();
//
//        EvenimentSpecial evenimentSpecialTest11 = EvenimentSpecial.builder()
//                .numeEveniment("Nunta")
//                .durataEveniment(17)
//                .pretEveniment(44000)
//                .tematicaEveniment("Suit")
//                .build();
//
//        EvenimentSpecial evenimentSpecialTest12 = EvenimentSpecial.builder()
//                .numeEveniment("Funeral")
//                .durataEveniment(2)
//                .pretEveniment(5700)
//                .tematicaEveniment("Culoare Neagra")
//                .build();
//
//        EvenimentSpecial evenimentSpecialTest13 = EvenimentSpecial.builder()
//                .numeEveniment("Revelion")
//                .durataEveniment(11)
//                .pretEveniment(400)
//                .tematicaEveniment("Elegant")
//                .build();
//
//        cofetarieService.adaugaEvenimentSpecial(evenimentSpecialTest10);
//        cofetarieService.adaugaEvenimentSpecial(evenimentSpecialTest11);
//        cofetarieService.adaugaEvenimentSpecial(evenimentSpecialTest12);
//        cofetarieService.adaugaEvenimentSpecial(evenimentSpecialTest13);
//        cofetarieService.afiseazaListaEvenimenteSpecialeCofetarie();
//        cofetarieService.afiseazaNumarEvenimenteSpecialeCofetarie();
//        cofetarieService.stergeUnEvenimentAnume(evenimentSpecialTest10);

        ////        //adaugam clienti
        Client clientTest1 = Client.builder()
                .adresa("iasi")
                .nume("ceva")
                .prenume("cristi")
                .varsta(29)
                .clientFidel(false)
                .build();


        Client clientTest2 = Client.builder()
                .adresa("neamt")
                .nume("ifrim")
                .prenume("cristina")
                .varsta(29)
                .clientFidel(false)
                .build();

        Client clientTest3 = Client.builder()
                .adresa("vaslui")
                .nume("popescu")
                .prenume("ramona")
                .varsta(29)
                .clientFidel(false)
                .build();

        Client clientTest4 = Client.builder()
                .adresa("vaslui")
                .nume("fierascu")
                .prenume("alexandru")
                .varsta(29)
                .clientFidel(false)
                .build();

        Client clientTest5 = Client.builder()
                .adresa("vaslui")
                .nume("fierascu")
                .prenume("roxana")
                .varsta(29)
                .clientFidel(false)
                .build();

        cofetarieService.adaugaClient(clientTest1);
        cofetarieService.adaugaClient(clientTest2);
        cofetarieService.adaugaClient(clientTest3);
        cofetarieService.adaugaClient(clientTest4);
        cofetarieService.adaugaClient(clientTest5);
        cofetarieService.afiseazaListaClientiCofetarie();
        cofetarieService.afiseazaNumarClientiExistenti();
//
//        cofetarieService.stergeClient(clientTest2);
//        cofetarieService.afiseazaListaClientiCofetarie();
//        cofetarieService.afiseazaNumarClientiExistenti();


        ///primul client are pozitia 0
        //al 2lea client are pozitia 1
        //al 3lea client are pozitia 2
//        cofetarieService.stergeClientPozitie();
//        cofetarieService.afiseazaListaClientiCofetarie();
//        cofetarieService.afiseazaNumarClientiExistenti();
//
//        cofetarieService.stergeTotiClientiCofetarie();
//        cofetarieService.afiseazaNumarClientiExistenti();
//
//        System.out.println("===================\n===================");
////
////
//        ////////////adaugam produse cofetarie
//        ProdusCofetarie produsCofetarie1 = new ProdusCofetarie();
//        produsCofetarie1.setNumeProdusCofetarie("tiramisu");
//        produsCofetarie1.setGramajProdusCofetarie(120);
//        produsCofetarie1.setPretProdusCofetarie(10.99);
//        ProdusCofetarie produsCofetarie2 = ProdusCofetarie.builder().
//                numeProdusCofetarie("cheesecake capsuni").
//                gramajProdusCofetarie(120).
//                pretProdusCofetarie(15.99).
//                build();
////
//        cofetarieService.adaugaProdusCofetarie(produsCofetarie1);
//        cofetarieService.adaugaProdusCofetarie(produsCofetarie2);
//        cofetarieSe`rvice.afiseazaListaProduseCofetarie();
//        cofetarieService.afiseazaNumarProduseCofetarieExistente();
////        cofetarieService.stergeProdusCofetarie(produsCofetarie1);
//        cofetarieService.stergeToateProduseleCofetari();
//        cofetarieService.adaugaEvenimentSpecial(evenimentSpecialTest10);
//        cofetarieService.afiseazaListaEvenimenteSpecialeCofetarie();
//        cofetarieService.stergeEvenimentCofetarie(evenimentSpecialTest10);
//        cofetarieService.stergeToateEvenimenteleSpeciale();


//
//        System.out.println("===================\n===================");
//        System.out.println("PROGRAM ORAR");
//
//        cofetarieService.creazaProgramOrar();
//        cofetarieService.afisareOrarCofetarie();
//
//        cofetarieService.schimbareOrar();
        cofetarieService.stergeClientDupaOCaracteristica(clientTest5);
//        cofetarieService.afisareOrarCofetarie();


//        clientService.adaugareProdusCofetarieInCosulDeCumparaturi(produsCofetarie1);
//        clientService.adaugareProdusCofetarieInCosulDeCumparaturi(produsCofetarie2);
//        clientService.afisarePretCosCumparaturi();


    }
}
