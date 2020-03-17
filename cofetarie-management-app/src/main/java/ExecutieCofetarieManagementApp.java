import model.Client;
import model.ProdusCofetarie;
import service.CofetarieService;

public class ExecutieCofetarieManagementApp {

    public static void main(String[] args) {

        //adaugam clienti
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

//        Client clientTest4  = new Client();
//        clientTest4.setNume("Decebal");clientTest4.setPrenume();

        CofetarieService cofetarieService = new CofetarieService();

        cofetarieService.adaugaClient(clientTest1);
        cofetarieService.adaugaClient(clientTest2);
        cofetarieService.adaugaClient(clientTest3);
        cofetarieService.afiseazaListaClientiCofetarie();
        cofetarieService.afiseazaNumarClientiExistenti();

        System.out.println("===================\n===================");
        ////////////adaugam produse cofetarie
        ProdusCofetarie produsCofetarie1 = new ProdusCofetarie();
        produsCofetarie1.setNumeProdusCofetarie("tiramisu");
        produsCofetarie1.setGramajProdusCofetarie(120);
        produsCofetarie1.setPretProdusCofetarie(10.99);
        ProdusCofetarie produsCofetarie2 = ProdusCofetarie.builder().
                numeProdusCofetarie("cheesecake capsuni").
                gramajProdusCofetarie(120).
                pretProdusCofetarie(15.99).
                build();

        cofetarieService.adaugaProdusCofetarie(produsCofetarie1);
        cofetarieService.adaugaProdusCofetarie(produsCofetarie2);
        cofetarieService.afiseazaListaProduseCofetarie();
        cofetarieService.afiseazaNumarProduseCofetarieExistente();
    }
}
