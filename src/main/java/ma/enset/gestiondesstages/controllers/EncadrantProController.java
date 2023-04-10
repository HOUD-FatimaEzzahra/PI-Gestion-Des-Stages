package ma.enset.gestiondesstages.controllers;

import ma.enset.gestiondesstages.models.EncadrantProfessionnel;
import ma.enset.gestiondesstages.repositories.EncadrantProRepository;
import ma.enset.gestiondesstages.services.EncadrantProService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EncadrantProController{

    private EncadrantProService encadrantProService;

    public EncadrantProController(EncadrantProService encadrantProService){
        this.encadrantProService = encadrantProService;
    }

    @PostMapping("/addeEncadrantPro")
    @ResponseBody
    public EncadrantProfessionnel addEncadrantPro(@RequestBody EncadrantProfessionnel encadrantProfessionnel){
        return encadrantProService.saveEncadrantPro(encadrantProfessionnel);
    }

    @GetMapping("/encadrantsPro")
    @ResponseBody
    public List<EncadrantProfessionnel> EncadrantsProListe() {
        return encadrantProService.listEncadrantsPro();
    }

    @GetMapping("/encadrantsPro/{id}")
    @ResponseBody
    public EncadrantProfessionnel getEncadrantPro(@PathVariable("id") String id){
        return encadrantProService.getEncadrantPro(id);
    }
    @PutMapping("/encadrantsPro/{id}")
    @ResponseBody
    public EncadrantProfessionnel updateEncadrantPro(@RequestBody EncadrantProfessionnel encadrantProfessionnel,
                                                     @PathVariable("id") String id)
    {
        return encadrantProService.updateEncadrantPro(encadrantProfessionnel, id);
    }

    @DeleteMapping("/deleteEncadrantPro")
    @ResponseBody
    public String deleteEncadrantPro(@PathVariable("id") String id){
        encadrantProService.deleteEncadrantPro(id);
        return "Deleted Successfully";
    }


}
