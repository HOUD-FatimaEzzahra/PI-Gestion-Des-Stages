package ma.enset.gestiondesstages.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class EncadrantProfessionnel extends Encadrant{
    private String service;
    private String poste;
    @OneToMany(mappedBy = "encadrantProfessionnel", fetch = FetchType.LAZY)
    private List<Stage> stages;
}
