package ma.enset.gestiondesstages.services;

import ma.enset.gestiondesstages.models.EncadrantAcademique;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;


public interface E_AcademiqueService {
    EncadrantAcademique SaveEncadrantAcademique(EncadrantAcademique encadrantAcademique);
    List<EncadrantAcademique> GetEncadrantsAcademique();

    EncadrantAcademique GetEncadrantAcademique(String id);


    EncadrantAcademique UpdateEncadrantAcademique(String id,EncadrantAcademique encadrantAcademique) throws ChangeSetPersister.NotFoundException;
    void deleteEncadrantAcademique(String id);
}
