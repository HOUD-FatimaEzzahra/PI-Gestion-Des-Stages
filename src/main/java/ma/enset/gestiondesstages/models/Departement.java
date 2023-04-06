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
public class Departement {
    @Id
    private String codeDepartement;
    private String intitule;
    private String chefDepartement;
    @OneToMany(mappedBy = "departement", fetch = FetchType.LAZY)
    private List<EncadrantAcademique> encadrantAcademique;
}
