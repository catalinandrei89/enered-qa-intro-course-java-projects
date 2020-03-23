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
public class EvenimentSpecial {

    private String numeEveniment;
    private int durataEveniment;
    private double pretEveniment;
    private String tematicaEveniment;
    private ArrayList<EvenimentSpecial> listaEvenimenteSpeciale = new ArrayList<>();
}
