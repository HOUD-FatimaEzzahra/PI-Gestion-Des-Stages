package ma.enset.gestiondesstages.controllers;

import ma.enset.gestiondesstages.models.EncadrantProfessionnel;
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
    public Entreprise updateEntreprise(@RequestBody Entreprise entreprise,
                                       @PathVariable("nomEntreprise") String nomEntreprise){
        return entrepriseService.updateEntreprise(entreprise, nomEntreprise);
    }

    //delete
    @DeleteMapping("/deleteEntreprise/{nomEntreprise}")
    @ResponseBody
    public  void deleteEntreprise(@PathVariable("nomEntreprise") String nomEntreprise){
        entrepriseService.deleteEntreprise(nomEntreprise);
    }
}
