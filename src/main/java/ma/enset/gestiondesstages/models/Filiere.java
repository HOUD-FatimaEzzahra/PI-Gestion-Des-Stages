package ma.enset.gestiondesstages.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Filiere
{
    @Id
    private String codeFiliere;
    private String intituleFiliere;
    private String descriptionFiliere;
    private String chefFiliere;
    @OneToMany(mappedBy = "filiere", fetch = FetchType.LAZY)
    private List<Etudiant> etudiants;
}
