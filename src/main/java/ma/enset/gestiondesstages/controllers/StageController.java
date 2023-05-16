package ma.enset.gestiondesstages.controllers;

import ma.enset.gestiondesstages.models.Stage;
import ma.enset.gestiondesstages.repositories.StageRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StageController {
    private StageRepository stageRepository;

    public StageController(StageRepository stageRepository)
    {
        this.stageRepository = stageRepository;
    }
    //Récupération
    @GetMapping("/stages")
    public List<Stage> Stages() {
        return stageRepository.findAll();
    }

    @GetMapping("/stages/{id}")
    public Stage Etudiants(@PathVariable Long id)
    {
        return stageRepository.findById(id).orElseThrow(()-> new RuntimeException(String.format("Stage %s Introuvable!", id)));
    }

    //Ajout
    @PostMapping("/add/stages")
    public Stage save(@RequestBody Stage stage)
    {
        return stageRepository.save(stage);
    }
    //Modification
    @PutMapping("/stages/{id}")
    public Stage update(@PathVariable Long id, @RequestBody Stage stage)
    {
        Stage stage1 = stageRepository.findById(id).orElseThrow();
        if(stage.getDateDebut()!=null)stage1.setDateDebut(stage.getDateDebut());
        if(stage.getDateFin()!=null)stage1.setDateFin(stage.getDateFin());
        if(stage.getDescriptionStage()!=null)stage1.setDescriptionStage(stage.getDescriptionStage());
        if(stage.getIntituleStage()!=null)stage1.setIntituleStage(stage.getIntituleStage());
        if(stage.getVille()!=null)stage1.setVille(stage.getVille());
        if(stage.getEntreprise()!=null)stage1.setEntreprise(stage.getEntreprise());
        if(stage.getTypeStage()!=null)stage1.setTypeStage(stage.getTypeStage());
        if(stage.getRapport()!=null)stage1.setRapport(stage.getRapport());
        if(stage.getCahierStage()!=null)stage1.setCahierStage(stage.getCahierStage());
        if(stage.getEncadrantAcademique()!=null)stage1.setEncadrantAcademique(stage.getEncadrantAcademique());
        if(stage.getEncadrantProfessionnel()!=null)stage1.setEncadrantProfessionnel(stage.getEncadrantProfessionnel());
        if(stage.getSoutenance()!=null)stage1.setSoutenance(stage.getSoutenance());
        return stageRepository.save(stage1);
    }
    //SUPPRESSION
    @DeleteMapping("/stage/{id}")
    public void delete(@PathVariable Long id)
    {
        stageRepository.deleteById(id);
    }

}
