package mostenire;

import lombok.Data;

@Data
public class MasinaLux extends Masina {



    public void asigurareMasina() {
        System.out.println("Doar asigurare de tip CASCO disponibila" +
                "\n Scoate banu', bo$$");
    }
}
