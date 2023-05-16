package ma.enset.gestiondesstages.controllers;

import ma.enset.gestiondesstages.models.Entreprise;
import ma.enset.gestiondesstages.services.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EntrepriseController {

    @Autowired
    private EntrepriseService entrepriseService;

    @GetMapping("/entreprises")
    public List<Entreprise> getAllEntreprises() {
        return entrepriseService.getAllEntreprises();
    }

    @GetMapping("/{nomEntreprise}")
    public Entreprise getEntrepriseByNom(@PathVariable String nomEntreprise) {
        return entrepriseService.getEntrepriseByNom(nomEntreprise);
    }

    @PostMapping("/entreprise")
    public Entreprise createEntreprise(@RequestBody Entreprise entreprise) {
        return entrepriseService.createEntreprise(entreprise);
    }

    @PutMapping("/{nomEntreprise}")
    public Entreprise updateEntreprise(@PathVariable String nomEntreprise, @RequestBody Entreprise entreprise) {
       Entreprise entreprise1= entrepriseService.getEntrepriseByNom(nomEntreprise);
        if(entreprise.getType()!=null) entreprise1.setType(entreprise.getType());
        if(entreprise.getActivite()!=null) entreprise1.setActivite(entreprise.getActivite());
        if(entreprise.getStages()!=null) entreprise1.setStages(entreprise.getStages());
        return entrepriseService.updateEntreprise(nomEntreprise, entreprise);
    }

    @DeleteMapping("/{nomEntreprise}")
    public Void deleteEntreprise(@PathVariable String nomEntreprise) {
        return entrepriseService.deleteEntreprise(nomEntreprise);
    }
}
