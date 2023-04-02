package ma.enset.gestiondesstages.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor @AllArgsConstructor
public class Etudiant {
    private int idUtilisateur;
    private String codeApogee;
    private String cne;
    private String cni;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String adresse;
    private String telephone;
    private String email;
}
