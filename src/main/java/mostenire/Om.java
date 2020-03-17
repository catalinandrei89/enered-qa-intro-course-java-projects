package mostenire;

import lombok.Data;

import java.util.Calendar;

@Data
public class Om {

    private String nume;
    private String prenume;
    private int anulNasterii;
    private double inaltime;
    private String adresa;


    public void calculeazaVarsta() {
        int anulCurent = Calendar.getInstance().get(Calendar.YEAR);
        int varstaActuala = anulCurent - anulNasterii;
        System.out.println("Omul are varsta de " + varstaActuala);
    }
}
