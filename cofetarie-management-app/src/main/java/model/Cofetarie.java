package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cofetarie {

    private String numeCofetarie;
    private String adresaCofetarie;
    private Map<String, String> orarCofetarie;
    private ArrayList<ProdusCofetarie> listaProduseCofetarie = new ArrayList<ProdusCofetarie>();
    private ArrayList<Client> listaClienti = new ArrayList<Client>();
    private ArrayList<EvenimentSpecial> listaEvenimenteSpeciale = new ArrayList<EvenimentSpecial>();




}
