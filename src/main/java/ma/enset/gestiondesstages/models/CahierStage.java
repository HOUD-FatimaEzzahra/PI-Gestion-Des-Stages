package ma.enset.gestiondesstages.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor @NoArgsConstructor
public class CahierStage {
    private long idCahier;
    private String description;
    private String[] taches;
    private String[] documents;
    private Date derniereModif;
}
