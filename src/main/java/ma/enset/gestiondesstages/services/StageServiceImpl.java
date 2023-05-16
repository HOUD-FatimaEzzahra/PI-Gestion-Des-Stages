package ma.enset.gestiondesstages.services;

import ma.enset.gestiondesstages.models.Stage;
import ma.enset.gestiondesstages.repositories.StageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;





@Service
public class StageServiceImpl implements StageService {



    @Autowired
    private StageRepository stageRepository;
    @Override
    public Stage saveStage(Stage stage) {
        return stageRepository.save(stage);
    }

    @Override
    public Stage getStage(String nomStage) {
        return stageRepository.findStageByNomStage(nomStage);
    }

    @Override
    public Stage updateStage(String id, Stage stage) {
        return null;
    }

    @Override
    public void deleteStage(String nomStage) {
        stageRepository.deleteStageByNomStage(nomStage);
    }

    @Override
    public List<Stage> listeStages() {
        List<Stage> stageList=stageRepository.findAll();
        return stageList;
    }





}
