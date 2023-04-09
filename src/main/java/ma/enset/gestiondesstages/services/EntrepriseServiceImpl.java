package ma.enset.gestiondesstages.services;

import ma.enset.gestiondesstages.models.Entreprise;
import ma.enset.gestiondesstages.repositories.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrepriseServiceImpl implements EntrepriseService{

    @Autowired
    private EntrepriseRepository entrepriseRepository;

    @Override
    public Entreprise saveEntreprise(Entreprise entreprise) {
        return entrepriseRepository.save(entreprise);
    }

    @Override
    public Entreprise getEntreprise(String nomEntreprise) {
        return entrepriseRepository.findEntrepriseByNomEntreprise(nomEntreprise);
    }

    @Override
    public Entreprise updateEntreprise(Entreprise entreprise) {
        Entreprise entrepriseExistante = entrepriseRepository.findEntrepriseByNomEntreprise(entreprise.getNomEntreprise());
        entrepriseExistante.setType(entreprise.getType());
        entrepriseExistante.setActivite(entreprise.getActivite());
        Entreprise entrepriseModifiee = entrepriseRepository.save(entrepriseExistante);

        return entrepriseModifiee;
    }

    @Override
    public void deleteEntreprise(String nomEntreprise){
        entrepriseRepository.deleteEntrepriseByNomEntreprise(nomEntreprise);
    }

    @Override
    public List<Entreprise> listeEntreprises() {
        List<Entreprise> entrepriseList=entrepriseRepository.findAll();
        return entrepriseList;
    }
}
