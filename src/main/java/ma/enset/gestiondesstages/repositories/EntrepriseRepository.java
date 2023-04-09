package ma.enset.gestiondesstages.repositories;

import ma.enset.gestiondesstages.models.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrepriseRepository extends JpaRepository<Entreprise,String> {
    void deleteEntrepriseByNomEntreprise(String nomEntreprise);
    Entreprise findEntrepriseByNomEntreprise(String nomEntreprise);
}
