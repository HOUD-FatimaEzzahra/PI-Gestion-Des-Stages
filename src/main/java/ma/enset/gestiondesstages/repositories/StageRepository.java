package ma.enset.gestiondesstages.repositories;


import ma.enset.gestiondesstages.models.Stage;
import org.springframework.boot.autoconfigure.jackson.JacksonProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StageRepository extends JpaRepository<Stage,Long> {

import ma.enset.gestiondesstages.models.Entreprise;
import ma.enset.gestiondesstages.models.Stage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StageRepository  extends JpaRepository<Stage,String> {
    void deleteStageByNomStage(String nomStage);
    Stage findStageByNomStage(String nomStage);

}
