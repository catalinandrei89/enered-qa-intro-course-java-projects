package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cofetarie {

    private String numeCofetarie;
    private String adresaCofetarie;
    private String numarTelefonCofetarie;
    private ArrayList<String> numereTelefon = new ArrayList<>();
    private Map<String, String> orarCofetarie = new LinkedHashMap<>();
    private ArrayList<ProdusCofetarie> listaProduseCofetarie = new ArrayList<>();
    private ArrayList<Client> listaClienti = new ArrayList<>();
    private ArrayList<EvenimentSpecial> listaEvenimenteSpeciale = new ArrayList<>();
}
