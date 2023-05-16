package ma.enset.gestiondesstages.services;

import jakarta.transaction.Transactional;
import ma.enset.gestiondesstages.models.EncadrantAcademique;
import ma.enset.gestiondesstages.repositories.E_AcademiqueRepository;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class E_AcademiqueServiceImpl implements E_AcademiqueService {
    private E_AcademiqueRepository eAcademiqueRepository;

    public E_AcademiqueServiceImpl(E_AcademiqueRepository eAcademiqueRepository) {
        this.eAcademiqueRepository = eAcademiqueRepository;
    }

    @Override
   public EncadrantAcademique SaveEncadrantAcademique(EncadrantAcademique encadrantAcademique) {
return eAcademiqueRepository.save(encadrantAcademique);
    }

    @Override
    public List<EncadrantAcademique> GetEncadrantsAcademique() {
      return eAcademiqueRepository.findAll();
    }


    @Override
    public EncadrantAcademique GetEncadrantAcademique(String id) {
       return eAcademiqueRepository.findEncadrantAcademiqueById(id);

    }

    @Override
    public EncadrantAcademique UpdateEncadrantAcademique(String id,EncadrantAcademique encadrantAcademique) throws ChangeSetPersister.NotFoundException {
        EncadrantAcademique oldencadrantAcademique=eAcademiqueRepository.findEncadrantAcademiqueById(id);
        oldencadrantAcademique.setPrenom(encadrantAcademique.getPrenom());
        oldencadrantAcademique.setNom(encadrantAcademique.getNom());
        oldencadrantAcademique.setStages(encadrantAcademique.getStages());
        oldencadrantAcademique.setDepartement(encadrantAcademique.getDepartement());
        eAcademiqueRepository.save(oldencadrantAcademique);
        return oldencadrantAcademique;
    }

    @Override
    public void deleteEncadrantAcademique(String id) {
        eAcademiqueRepository.deleteById(id);
    }
}
