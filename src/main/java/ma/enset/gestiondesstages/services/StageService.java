package ma.enset.gestiondesstages.services;

import ma.enset.gestiondesstages.models.Stage;

import java.util.List;

public interface StageService {

    Stage saveStage(Stage stage);
    Stage getStage(String nomStage);
    Stage updateStage(String id, Stage stage);
    void deleteStage(String nomStage);
    List<Stage> listeStages();
}
