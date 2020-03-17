package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Telefon {

    private int procentBaterie;
    private double grosimeTelefon;
    private String numeProcesor;
    private String culoare;
    private double pret;
    private double dimensiuneDisplay;
    private String numeProducator;
    private String modelTelefon;


    public void puneLaIncarcat() {
        System.out.println("Phone charging!!!");
        procentBaterie += 10;
        System.out.println("Nivelul bateriei este " + procentBaterie);
    }


}