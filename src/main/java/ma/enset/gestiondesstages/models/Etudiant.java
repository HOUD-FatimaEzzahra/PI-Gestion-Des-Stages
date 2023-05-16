package ma.enset.gestiondesstages.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant
{
    @Id
    private String codeApogee;
    private String cne;
    private String cni;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String adresse;
    private String telephone;
    private String email;
    private String ville;
    public String userId;
    @OneToMany(mappedBy = "etudiant", fetch = FetchType.LAZY)
    private List<Stage> stages;
    @ManyToOne
    private Filiere filiere;
}
