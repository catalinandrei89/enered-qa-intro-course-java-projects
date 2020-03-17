package mostenire;

import lombok.Data;

@Data
public class Copil extends Om {

    public String scoala;

    public void afisareInformatiiUndeInvataCopil() {
        System.out.println("Copilul cu numele de " + getNume() + " si cu varsta de " + getVarsta() + " invata la scoala" + scoala + ".");

    }
}