package mostenire;


public class Om {
    private int varsta;
    private String nume;

    public void afisareInformatiiOm() {
        System.out.println("Omul are varsta de " + varsta + " si il cheama " + nume + ".");
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}