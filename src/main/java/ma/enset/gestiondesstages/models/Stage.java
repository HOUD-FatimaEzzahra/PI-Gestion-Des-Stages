package ma.enset.gestiondesstages.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stage
{
    @Id
    private int idStage;
    private String intituleStage;
    private String descriptionStage;
    private TypeStage typeStage;
    private String ville;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    @ManyToOne
    private Etudiant etudiant;
    @ManyToOne
    private EncadrantAcademique encadrantAcademique;
    @ManyToOne
    private EncadrantProfessionnel encadrantProfessionnel;
    @ManyToOne
    private Entreprise entreprise;
    @OneToOne
    private Rapport rapport;
    @OneToOne
    private Soutenance soutenance;
    @OneToOne
    private CahierStage cahierStage;
}
