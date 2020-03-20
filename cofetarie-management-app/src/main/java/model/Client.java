package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client {

    private String nume;
    private String prenume;
    private String adresa;
    private int varsta;
    private boolean clientFidel;
    private ArrayList<ProdusCofetarie> listaProduseCofetarieClient = new ArrayList<>();
}


