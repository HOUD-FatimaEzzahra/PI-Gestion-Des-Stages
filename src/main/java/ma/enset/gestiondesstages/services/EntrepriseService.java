package ma.enset.gestiondesstages.services;

import ma.enset.gestiondesstages.models.Entreprise;

import java.util.List;

public interface EntrepriseService {
    Entreprise saveEntreprise(Entreprise entreprise);
    Entreprise getEntreprise(String nomEntreprise);
    Entreprise updateEntreprise(Entreprise entreprise);
    void deleteEntreprise(String nomEntreprise);
    List<Entreprise> listeEntreprises();
}
