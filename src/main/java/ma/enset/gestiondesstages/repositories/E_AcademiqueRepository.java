package ma.enset.gestiondesstages.repositories;

import ma.enset.gestiondesstages.models.EncadrantAcademique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface E_AcademiqueRepository extends JpaRepository<EncadrantAcademique,String> {

    public EncadrantAcademique findEncadrantAcademiqueById(String id);


}
