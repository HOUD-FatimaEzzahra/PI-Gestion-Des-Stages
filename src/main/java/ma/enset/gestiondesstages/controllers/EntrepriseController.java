package ma.enset.gestiondesstages.controllers;

import ma.enset.gestiondesstages.models.Entreprise;
import ma.enset.gestiondesstages.services.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entreprises")
public class EntrepriseController {

    @Autowired
    private EntrepriseService entrepriseService;

    @GetMapping("/entreprises")
    public ResponseEntity<List<Entreprise>> getAllEntreprises() {
        List<Entreprise> entreprises = entrepriseService.getAllEntreprises();
        return new ResponseEntity<>(entreprises, HttpStatus.OK);
    }

    @GetMapping("/{nomEntreprise}")
    public ResponseEntity<Entreprise> getEntrepriseByNom(@PathVariable String nomEntreprise) {
        Entreprise entreprise = entrepriseService.getEntrepriseByNom(nomEntreprise);
        return new ResponseEntity<>(entreprise, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Entreprise> createEntreprise(@RequestBody Entreprise entreprise) {
        Entreprise createdEntreprise = entrepriseService.createEntreprise(entreprise);
        return new ResponseEntity<>(createdEntreprise, HttpStatus.CREATED);
    }

    @PutMapping("/update/{nomEntreprise}")
    public ResponseEntity<Entreprise> updateEntreprise(@PathVariable String nomEntreprise, @RequestBody Entreprise entreprise) {
        Entreprise updatedEntreprise = entrepriseService.updateEntreprise(nomEntreprise, entreprise);
        return new ResponseEntity<>(updatedEntreprise, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{nomEntreprise}")
    public ResponseEntity<Void> deleteEntreprise(@PathVariable String nomEntreprise) {
        entrepriseService.deleteEntreprise(nomEntreprise);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
