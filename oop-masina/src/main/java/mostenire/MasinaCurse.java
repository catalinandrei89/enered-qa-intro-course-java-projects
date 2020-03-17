package mostenire;

import lombok.Data;

import java.util.ArrayList;

@Data
public class MasinaCurse extends Masina {

    private ArrayList<String> sponsori = new ArrayList<String>();
    private String numeMasinaCurse;

    public void adaugaSponsor(String numeSponsor) {
        sponsori.add(numeSponsor);
        System.out.println("Sponsorul " + numeSponsor + " tocmai a fost adaugat" +
                "la lista de sponsori");
    }

    public void adaugaSponsori(ArrayList<String> sponsoriNoi) {
        sponsori.addAll(sponsoriNoi);
        for (String i : sponsoriNoi) {
            System.out.println(i);
        }
    }

    public void afisareaSponsori() {
        System.out.println("Sponsorii masinii de lux " + numeMasinaCurse + " sunt: ");
        for (String i : sponsori) {
            System.out.println(i);
        }
    }

    public void afisareNumarSponsori() {
        System.out.println("Masina de lux " + numeMasinaCurse + " are " + sponsori.size() + " sponsori");
    }
}
