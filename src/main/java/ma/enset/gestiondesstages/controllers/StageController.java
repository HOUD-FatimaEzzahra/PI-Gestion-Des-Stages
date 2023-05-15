package ma.enset.gestiondesstages.controllers;

import ma.enset.gestiondesstages.models.Stage;
import ma.enset.gestiondesstages.services.StageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StageController {
    @Autowired
    private StageService stageService;
    //Create
    @PostMapping("/addStage")
    @ResponseBody
    public Stage ajouterStage(@RequestBody Stage stage){
        return stageService.saveStage(stage);
    }

    //Read
    @GetMapping("/Stages")
    @ResponseBody
    public List<Stage> StagesListe(){
        return stageService.listeStages();
    }

    @GetMapping("/Stages/{nomStage}")
    @ResponseBody
    public Stage getStage(@PathVariable(name = "nomStage") String nomStage){
        return stageService.getStage(nomStage);
    }
    //update

    @PutMapping("/encadrantsacademiques/modifier/{id}")
    public String modifierStage(@PathVariable String id,@RequestBody Stage stagemodifie) throws ChangeSetPersister.NotFoundException {
        stageService.updateStage(id,stagemodifie);

        return "Stage a été modifié avec succès";
    }

    //delete
    @DeleteMapping("/deleteStage/{nomStage}")
    @ResponseBody
    public void deleteStage(@PathVariable("nomStage")String nomStage){
        stageService.deleteStage(nomStage);
    }












}
