package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EvenimentSpecial {

    private String numeEveniment;
    private int durataEveniment;
    private double pretEveniment;
    private String tematicaEveniment;
}
