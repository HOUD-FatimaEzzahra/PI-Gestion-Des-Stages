package ma.enset.gestiondesstages.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor @AllArgsConstructor
public class Filiere {
    private String codeFiliere;
    private String intituleFiliere;
    private String descriptionFiliere;
    private String chefFiliere;
}
