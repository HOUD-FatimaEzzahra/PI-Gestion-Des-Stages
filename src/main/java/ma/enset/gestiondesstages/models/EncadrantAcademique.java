package ma.enset.gestiondesstages.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Data
@Setter
@Getter
@DiscriminatorValue("Academique")
public class EncadrantAcademique extends Encadrant{
    @OneToMany(mappedBy = "encadrantAcademique", fetch = FetchType.LAZY)
    private List<Stage> stages;
    @ManyToOne
    private Departement departement;
}
