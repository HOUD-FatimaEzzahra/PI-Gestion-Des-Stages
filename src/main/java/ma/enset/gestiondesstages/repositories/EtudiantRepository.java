package ma.enset.gestiondesstages.repositories;

import ma.enset.gestiondesstages.models.Etudiant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, String>
{
    List<Etudiant> findByVille(String city);
}
