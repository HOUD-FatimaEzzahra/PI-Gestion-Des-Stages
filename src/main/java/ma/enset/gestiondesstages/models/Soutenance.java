package ma.enset.gestiondesstages.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor @AllArgsConstructor
public class Soutenance {
    private int idSoutenance;
    private Date dateSoutenance;
    private String[] jury;
    private String etudiant;
    private float note;
    private String salle;
}
