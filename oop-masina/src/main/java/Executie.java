import mostenire.MasinaCurse;

import java.util.ArrayList;

public class Executie {

    public static void main(String[] args) {

        MasinaCurse mah = new MasinaCurse();

        ArrayList<String> sponsoriMasinaMah = new ArrayList<String>();
        sponsoriMasinaMah.add("brembo");
        sponsoriMasinaMah.add("repsol");
        sponsoriMasinaMah.add("mobil");
        sponsoriMasinaMah.add("castrol");


        mah.adaugaSponsor("Pirelli");
        mah.adaugaSponsori(sponsoriMasinaMah);
    }
}
