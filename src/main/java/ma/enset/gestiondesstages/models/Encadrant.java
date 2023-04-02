package ma.enset.gestiondesstages.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class Encadrant {
    private int idUtilisateur;
    private String idEncadrant;
    private String nom;
    private String prenom;

}
