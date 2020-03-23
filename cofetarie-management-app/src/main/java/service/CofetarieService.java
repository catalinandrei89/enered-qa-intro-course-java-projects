package service;

import model.Client;
import model.Cofetarie;
import model.EvenimentSpecial;
import model.ProdusCofetarie;
import utils.ZileleSaptamanii;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CofetarieService {
    //obiectul trebuie initializat
    private Cofetarie cofetariaMea = new Cofetarie();

    //creat metoda prin care la cofetarieService adaug o cofetarie
    public void creareCofetarie() {
        Scanner scannerNumeCofetarie = new Scanner(System.in);
        Scanner scannerAdresaCofetarie = new Scanner(System.in);
        Scanner scannerNrTelefonCofetarie = new Scanner(System.in);
        System.out.println("Dati numele cofetariei ");
        String numeCofetarie = scannerNumeCofetarie.nextLine();
        cofetariaMea.setNumeCofetarie(numeCofetarie);
        System.out.println("Dati adresa cofetariei ");
        String adresaCofetarie = scannerAdresaCofetarie.nextLine();
        cofetariaMea.setAdresaCofetarie(adresaCofetarie);
        System.out.println("Dati numarul de telefon al cofetariei ");
        String numarTelefonCofetarie = scannerNrTelefonCofetarie.nextLine();
        cofetariaMea.setNumarTelefonCofetarie(numarTelefonCofetarie);
    }

    public void afisareInformatiiCofetarie() {
        System.out.println("Cofetaria " + cofetariaMea.getNumeCofetarie() +
                " se afla la adresa " + cofetariaMea.getAdresaCofetarie() +
                " si poate fi contactata la numarul de telefon " +
                cofetariaMea.getNumarTelefonCofetarie());
    }

    public void schimbareAdresaCofetarie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati adresa noua a cofetariei " + cofetariaMea.getNumeCofetarie());
        String nouaAdresa = scanner.nextLine();
        cofetariaMea.setAdresaCofetarie(nouaAdresa);
        afisareInformatiiCofetarie();
    }

    public void schimbareNumarTelefonCofetarie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati numarul de telefon nou a cofetariei " + cofetariaMea.getNumeCofetarie());
        String noulNumarDeTelefon = scanner.nextLine();
        cofetariaMea.setNumarTelefonCofetarie(noulNumarDeTelefon);
        afisareInformatiiCofetarie();
    }

    //TODO optional : metoda care adauga, sterge, afiseaza numere de telefon

    public void adaugaClient(Client clientNou) {
        cofetariaMea.getListaClienti().add(clientNou);
    }
    public void adaugaEveniment(EvenimentSpecial evenimentNou) {cofetariaMea.getListaEvenimenteSpeciale().add(evenimentNou);}


    public void afiseazaListaClientiCofetarie() {
        for (Client clientDinCofetarie : cofetariaMea.getListaClienti()) {
            System.out.println(clientDinCofetarie);
        }
    }

    public void afiseazaNumarClientiExistenti() {
        System.out.println("Cofetaria mea are " +
                cofetariaMea.getListaClienti().size() + " clienti");
    }

    public void stergeClient(Client clientulCareVaFiSters) {
        System.out.println("Atentie!!! Un client va fi sters! " +
                "Esti sigur ca vrei sa stergi clientul " + clientulCareVaFiSters.getNume());
        Scanner scanner = new Scanner(System.in);
        String raspuns = scanner.nextLine().toUpperCase();
        if (raspuns.equals("YES") || raspuns.equals("DA") || raspuns.equals("AFIRMATIV")) {
            cofetariaMea.getListaClienti().remove(clientulCareVaFiSters);
            System.out.println("Clientul " + clientulCareVaFiSters.getNume() + " a fost sters");
        } else {
            System.out.println("Clientul " + clientulCareVaFiSters.getNume() + " nu va fi sters");
            System.out.println("Ai grija mai mare data viitoare");
        }
    }

    public void stergeTotiClientiCofetarie() {
        System.out.println("Intreaga lista de clienti a fost stearsa");
        cofetariaMea.getListaClienti().clear();
    }

    public void stergeClientPozitie() {
        //verificare ca clientul de pe pozitia {pozitie} exista
        /*
         * PASI:
         * 1. nrClientiRamasi = numar cati clienti au mai ramas
         * 2. compar numarul de clienti ramasi cu nr pozitie
         * if(pozitie <= nrClientiRamasi)
         * se poate sterge clientul de pe pozitia {pozitie}
         * else
         * clientul de pe pozitia {pozitie} nu poate fi sters deoarece el nu exista
         *
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati pozitia pentru care clientul va fi sters");
        int pozitie = scanner.nextInt();
        int nrClientiRamasi = cofetariaMea.getListaClienti().size();
        if (pozitie <= nrClientiRamasi) {
            cofetariaMea.getListaClienti().remove(pozitie);
        } else {
            System.out.println("Clientul de pe pozitia " + pozitie + " nu poate fi sters pentru ca nu exista");
        }

    }

    public void adaugaProdusCofetarie(ProdusCofetarie produsNou) {
        cofetariaMea.getListaProduseCofetarie().add(produsNou);
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

    //TODO 1: metoda sters produs cofetarie
    public void stergeProdusCofetarie(ProdusCofetarie produsulCareVafiSters) {
        System.out.println("Atentie!!! Un produs va fi sters! " +
                "Esti sigur ca vrei sa stergi produsul " + produsulCareVafiSters.getNumeProdusCofetarie());
        Scanner scanner3 = new Scanner(System.in);
        String raspuns1=scanner3.nextLine().toUpperCase();
        if(raspuns1.equals("YES") || raspuns1.equals("NO") || raspuns1.equals("AFIRMATIV")) {
            cofetariaMea.getListaProduseCofetarie().remove(produsulCareVafiSters);
            System.out.println("Produsul "+ produsulCareVafiSters.getNumeProdusCofetarie() +" a fost sters");
        }else{
            System.out.println("Produsul" + produsulCareVafiSters.getNumeProdusCofetarie() + " nu va fi sters");
            System.out.println("Ai grija mai mare data viitoare!");
        }
    }



    //TODO 2: metoda sters toate produsele cofetarie
    public void stergeToateProduseleCofetari() {
        System.out.println("Intreaga lista de produse cofetarie a fost stearsa");
        cofetariaMea.getListaProduseCofetarie().clear();
    }

    //TODO 3: metoda sters produs cofetarie specific
    public void adaugaEvenimentSpecial(EvenimentSpecial evenimentNou) {
        cofetariaMea.getListaEvenimenteSpeciale().add(evenimentNou);
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

    //TODO 4: metoda sters eveniment cofetarie
    public void stergeEvenimentCofetarie(EvenimentSpecial evenimentulCareVaFiSters) {
        System.out.println("Atentie!! Un eveniment va fi sters! " + " Esti Sigur ca vrei sa stergi evenimentul " + evenimentulCareVaFiSters.getListaEvenimenteSpeciale()+ "?");
        Scanner scanner=new Scanner(System.in);
        String raspuns=scanner.nextLine().toUpperCase();
        if (raspuns.equals("YES")||raspuns.equals("No")|| raspuns.equals("AFIRMATIV")){
            cofetariaMea.getListaEvenimenteSpeciale().remove(evenimentulCareVaFiSters);
            System.out.println("Evenimentul " +evenimentulCareVaFiSters.getListaEvenimenteSpeciale()+" a fost sters");
        }else{
            System.out.println("Evenimentul" +evenimentulCareVaFiSters.getListaEvenimenteSpeciale()+" nu a fost sters");
            System.out.println("Fii atent pe viitor, loosere!!");
        }
    }
    //TODO 5: metoda sters toate evenimentele cofetariei
    public void stergeToateEvenimenteleSpeciale(){
        System.out.println("Intreaga lista de evenimente a fost stearsa");
        cofetariaMea.getListaEvenimenteSpeciale().clear();
    }


    //TODO 6: metoda sters eveniment cofetarie specific
    public void stergeUnEvenimentAnume(EvenimentSpecial evenimentulCareVaFiSters){
        System.out.println("Atentie!! Un eveniment special va fi sters ! " +"Esti sigur ca vrei sa stergi evenimentul "+evenimentulCareVaFiSters.getNumeEveniment());
        Scanner scanner=new Scanner(System.in);
        String raspuns= scanner.nextLine().toUpperCase();
        if (raspuns.equals("YES")|| raspuns.equals("NO") || raspuns.equals("DESIGUR")){
            cofetariaMea.getListaEvenimenteSpeciale().remove(evenimentulCareVaFiSters);
            System.out.println("Evenimentul "+ evenimentulCareVaFiSters.getNumeEveniment()+ " a fost sters" );
        }else{
            System.out.println("Evenimentul "+evenimentulCareVaFiSters.getNumeEveniment()+ " nu a fost sters");
            System.out.println("Fii mai atent pe viitor");
        }
    }
    public void creazaProgramOrar() {
        cofetariaMea.getOrarCofetarie().put(String.valueOf(ZileleSaptamanii.LUNI), "08:00-12:30 la 13:30-17:00");
        cofetariaMea.getOrarCofetarie().put(String.valueOf(ZileleSaptamanii.MARTI), "08:00-12:30 la 13:30-17:00");
        cofetariaMea.getOrarCofetarie().put(String.valueOf(ZileleSaptamanii.MIERCURI), "08:00-12:30 la 13:30-17:00");
        cofetariaMea.getOrarCofetarie().put(String.valueOf(ZileleSaptamanii.JOI), "08:00-12:30 la 13:30-17:00");
        cofetariaMea.getOrarCofetarie().put(String.valueOf(ZileleSaptamanii.VINERI), "08:00-12:30 la 13:30-17:00");
        cofetariaMea.getOrarCofetarie().put(String.valueOf(ZileleSaptamanii.SAMBATA), "10:00-13:30");
        cofetariaMea.getOrarCofetarie().put(String.valueOf(ZileleSaptamanii.DUMINICA), "Cofetaria este inchisa");
        /*
         * MAP
         * K               |    V
         * ziua saptamanii | orarul
         * LUNI          | 08:00-12:30 13:30-17:00
         * MARTI         |
         * MIERCURI      |
         * JOI           |
         * VINERI        |
         * SAMBATA       |
         * DUMINICA      |
         * */
    }

    public void afisareOrarCofetarie() {
        for (String intrare : cofetariaMea.getOrarCofetarie().keySet()) {
            System.out.println(intrare + " programul este de la " + cofetariaMea.getOrarCofetarie().get(intrare));
        }
    }

    public void schimbareOrar() {
        //TODO 7: verificare daca ziua introdusa de la tastatura este o cheie valida (LUNI, MARTI, etc)
        System.out.println("-----ORARUL SE VA SCHIMBA-----");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduceti ziua pentru care doriti sa faceti schimbarea de orar");
        String zi = scanner1.nextLine().toUpperCase();
        if (zi.equals(ZileleSaptamanii.LUNI)||zi.equals(ZileleSaptamanii.MARTI)||zi.equals(ZileleSaptamanii.MIERCURI)||zi.equals(ZileleSaptamanii.JOI)||zi.equals(ZileleSaptamanii.VINERI)||zi.equals(ZileleSaptamanii.SAMBATA)||zi.equals(ZileleSaptamanii.DUMINICA)){
            System.out.println("Se poate valida schimbarea de orar");
        }else{
            System.out.println("Reintrodu o zi valida");
            System.out.println("Introduceti ziua pentru care doriti sa faceti schimbarea de orar");
            String zi1 = scanner1.nextLine().toUpperCase();
        }

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Introduceti programul nou pentru ziua de "+zi);
        String programOrarNou = scanner1.nextLine();
        cofetariaMea.getOrarCofetarie().replace(zi, programOrarNou);
        System.out.println("Noul program pentru "+zi+" este " + programOrarNou);
    }


    //TODO 8: metoda prin care poti sa stergi un client - dupa nume/ prenume/ adresa/ nrTelefon/ CNP
    /*SOLUTIE ANA - METODA STERS CLIENT DUPA NUME
     *1. citim o proprietate tastatura
     * dar :
     * daca florin - fistName (tudor) - lastName, tudor-fistName fierascu-lastName
     * 2. verificam daca numele exista in lista de clienti
     * 3. daca exista -> stergem
     * */
 public void stergeClientDupaOCaracteristica(Client clientulCareVaFiSters){
     System.out.println("Atentie!! Esti pe punctul de a sterge un client!! Esti sigur ca vrei sa stergi clientul "+ clientulCareVaFiSters.getNume());
     Scanner scanner=new Scanner(System.in);
     String raspuns=scanner.nextLine().toUpperCase();
     if(raspuns.equals("YES")||raspuns.equals("NO")||raspuns.equals("DESIGUR")){
         cofetariaMea.getListaClienti().remove(clientulCareVaFiSters);
         System.out.println("Clientul "+clientulCareVaFiSters.getNume()+" a fost sters");
     } else {
         System.out.println("Clientul "+clientulCareVaFiSters.getNume() +" nu a fost sters");
         System.out.println("Fii mai atent, te rog!!");
     }

 }

// public void stergeClientAlandala(Client clientulCareUrmeazaAFiSters){
//     System.out.println("Esti pe punctul de a sterge un client!! "+"Doresti sa stergi clientul "+clientulCareUrmeazaAFiSters.getVarsta());
//     Scanner scanner= new Scanner(System.in);
//     String raspuns=scanner.nextLine().toUpperCase();
//     if(raspuns.equals("BLA")||raspuns.equals("NADA")||raspuns.equals("CIAO")){
//         cofetariaMea.getListaClienti().remove(clientulCareUrmeazaAFiSters);
//         System.out.println("Clientul"+clientulCareUrmeazaAFiSters.getVarsta()+"a fost sters");
//     }else{
//         System.out.println("Clientul"+clientulCareUrmeazaAFiSters.getVarsta()+" nu a fost sters");
//         System.out.println("Fii mai atent pe viitor");
//     }
// }


}
