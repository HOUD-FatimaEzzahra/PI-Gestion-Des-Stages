package ma.enset.gestiondesstages.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor @NoArgsConstructor
public class Entreprise {
    private String nomEntreprise;
    private String type;
    private String activite;
    private int effectif;

}
