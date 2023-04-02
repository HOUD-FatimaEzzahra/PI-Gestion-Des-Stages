package ma.enset.gestiondesstages.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor @NoArgsConstructor
public class Document {
    private int idDocument;
    private String titre;
    private String description;
    private Date dateDepot;
}
