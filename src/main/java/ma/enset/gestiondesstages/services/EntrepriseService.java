package ma.enset.gestiondesstages.services;

import ma.enset.gestiondesstages.models.Entreprise;

import java.util.List;

public interface EntrepriseService {
    List<Entreprise> getAllEntreprises();

    Entreprise getEntrepriseByNom(String nomEntreprise);

    Entreprise createEntreprise(Entreprise entreprise);

    Entreprise updateEntreprise(String nomEntreprise, Entreprise entreprise);

    Void deleteEntreprise(String nomEntreprise);
}
