package ma.enset.gestiondesstages.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
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
    private LocalDate dateNaissance;
    private String adresse;
    private String telephone;
    private String email;
    public String userId;
    @OneToMany(mappedBy = "etudiant", fetch = FetchType.LAZY)
    private List<Stage> stages;
    @ManyToOne
    private Filiere filiere;
}
