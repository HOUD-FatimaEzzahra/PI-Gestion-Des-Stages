package ma.enset.gestiondesstages.controllers;

import ma.enset.gestiondesstages.models.EncadrantAcademique;
import ma.enset.gestiondesstages.repositories.E_AcademiqueRepository;
import ma.enset.gestiondesstages.services.E_AcademiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class E_AcademiqueController {

    public E_AcademiqueController(E_AcademiqueService eAcademiqueService) {
        this.eAcademiqueService = eAcademiqueService;
    }

    private E_AcademiqueService eAcademiqueService;

   @GetMapping("/encadrantsacademique")
   public List<EncadrantAcademique> getencadrants(){
       return eAcademiqueService.GetEncadrantsAcademique();
   }
   @PostMapping("/encadrantsacademiques/ajouter")
    public String AjouterEncadrantAcademique(@RequestBody EncadrantAcademique encadrantAcademique){
        eAcademiqueService.SaveEncadrantAcademique(encadrantAcademique);
        return "l'encadrant a été ajouté avec succes";
    }
 @PutMapping("/encadrantsacademiques/modifier/{id}")
    public String modifierEncadrantAcademique(@PathVariable String id,@RequestBody EncadrantAcademique encadrantAcademiquemodifie) throws ChangeSetPersister.NotFoundException {
       eAcademiqueService.UpdateEncadrantAcademique(id,encadrantAcademiquemodifie);
return "L'encadrant académique a été modifié avec succès";
 }

 @DeleteMapping("/encadrantsacademiques/supprimer/{id}")
        public String deleteEncadrantAcademique(@PathVariable String id){
        eAcademiqueService.deleteEncadrantAcademique(id);
     return "L'encadrant académique a été supprimé avec succès";
 }


}
