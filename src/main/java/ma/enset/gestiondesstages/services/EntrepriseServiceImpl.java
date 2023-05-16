package ma.enset.gestiondesstages.services;


import ma.enset.gestiondesstages.exeptions.ResourceNotFoundException;
import ma.enset.gestiondesstages.models.Entreprise;
import ma.enset.gestiondesstages.repositories.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrepriseServiceImpl implements EntrepriseService {

    @Autowired
    private EntrepriseRepository entrepriseRepository;

    @Override
    public List<Entreprise> getAllEntreprises() {
        return entrepriseRepository.findAll();
    }

    @Override
    public Entreprise getEntrepriseByNom(String nomEntreprise) {
        return entrepriseRepository.findById(nomEntreprise)
                .orElseThrow(() -> new ResourceNotFoundException("Entreprise not found with nomEntreprise: " + nomEntreprise));
    }

    @Override
    public Entreprise createEntreprise(Entreprise entreprise) {
        return entrepriseRepository.save(entreprise);
    }

    @Override
    public Entreprise updateEntreprise(String nomEntreprise, Entreprise entreprise) {
        Entreprise existingEntreprise = entrepriseRepository.findById(nomEntreprise)
                .orElseThrow(() -> new ResourceNotFoundException("Entreprise not found with nomEntreprise: " + nomEntreprise));
        existingEntreprise.setType(entreprise.getType());
        existingEntreprise.setActivite(entreprise.getActivite());
        existingEntreprise.setStages(entreprise.getStages());
        return entrepriseRepository.save(existingEntreprise);
    }

    @Override
    public Void deleteEntreprise(String nomEntreprise) {
        Entreprise existingEntreprise = entrepriseRepository.findById(nomEntreprise)
                .orElseThrow(() -> new ResourceNotFoundException("Entreprise not found with nomEntreprise: " + nomEntreprise));
        entrepriseRepository.delete(existingEntreprise);
        return null;
    }
}

