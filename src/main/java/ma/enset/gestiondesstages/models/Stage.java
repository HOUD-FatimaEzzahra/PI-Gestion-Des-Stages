package ma.enset.gestiondesstages.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor @NoArgsConstructor
public class Stage {
    private int idStage;
    private String intetuleStage;
    private String descriptionStage;
    private TypeStage typeStage;
    private String ville;
    private Date dateDebut;
    private Date dateFin;
}
