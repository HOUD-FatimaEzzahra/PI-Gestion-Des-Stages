package ma.enset.gestiondesstages;

import ma.enset.gestiondesstages.models.Encadrant;
import ma.enset.gestiondesstages.models.EncadrantAcademique;
import ma.enset.gestiondesstages.repositories.E_AcademiqueRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GestionDesStagesApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionDesStagesApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(E_AcademiqueRepository eAcademiqueRepository){
        return args -> {
           eAcademiqueRepository.save(new EncadrantAcademique("test","najah","najah","test",null,null));
        };
    }


}
