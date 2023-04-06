package ma.enset.gestiondesstages.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class EncadrantAcademique extends Encadrant{
    @OneToMany(mappedBy = "encadrantAcademique", fetch = FetchType.LAZY)
    private List<Stage> stages;
    @ManyToOne
    private Departement departement;
}
