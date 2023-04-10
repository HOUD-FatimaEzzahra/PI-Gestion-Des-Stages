package ma.enset.gestiondesstages.controllers;

import ma.enset.gestiondesstages.models.Entreprise;
import ma.enset.gestiondesstages.services.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class EntrepriseController {
    @Autowired
    private EntrepriseService entrepriseService;

    //create
    @PostMapping("/addEntreprise")
    @ResponseBody
    public Entreprise ajouterEntreprise(@RequestBody Entreprise entreprise){
        return entrepriseService.saveEntreprise(entreprise);
    }

    //read
    @GetMapping("/entreprises")
    @ResponseBody
    public List<Entreprise> entreprisesListe(){
        return entrepriseService.listeEntreprises();
    }

    @GetMapping("/entreprises/{nomEntreprise}")
    @ResponseBody
    public Entreprise getEntreprise(@PathVariable(name = "nomEntreprise") String nomEntreprise){
        return entrepriseService.getEntreprise(nomEntreprise);
    }

    //update
    @PutMapping("/entreprises/{nomEntreprise}")
    @ResponseBody
    public Entreprise updateEntreprise(@PathVariable(name = "nomEntreprise") String nomEntreprise, @RequestBody Entreprise entreprise){
        Entreprise e = entrepriseService.getEntreprise(nomEntreprise);
        if(e != null){
            e.setNomEntreprise(entreprise.getNomEntreprise());
            e.setType(entreprise.getType());
            e.setActivite(entreprise.getActivite());
            entrepriseService.saveEntreprise(e);
        }
        return e;
    }

    //delete
    @DeleteMapping("/deleteEntreprise/{nomEntreprise}")
    @ResponseBody
    public void deleteEntreprise(@PathVariable(name = "nomEntreprise")String nomEntreprise){
        entrepriseService.deleteEntreprise(nomEntreprise);
    }

}
