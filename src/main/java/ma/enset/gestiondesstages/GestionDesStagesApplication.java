package ma.enset.gestiondesstages;

import ma.enset.gestiondesstages.models.Etudiant;
import ma.enset.gestiondesstages.models.Filiere;
import ma.enset.gestiondesstages.repositories.EtudiantRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class GestionDesStagesApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionDesStagesApplication.class, args);
    }

   @Bean
    CommandLineRunner start(EtudiantRepository etudiantRepository)
    {
        return args ->
        {
            Etudiant etudiant = new Etudiant();
            etudiant.setCodeApogee("19827337");
            etudiant.setCne("H130230204");
            etudiant.setCni("F654546");
            etudiant.setNom("OUAKIL");
            etudiant.setPrenom("Manal");
            etudiant.setEmail("manalouakil16@gmail.com");
            etudiant.setDateNaissance(new Date());
            etudiant.setTelephone("0626155171");
            etudiant.setVille("OUJDA");
            etudiant.setAdresse("OUJDA N24");
            etudiantRepository.save(etudiant);
            System.out.println(etudiant);

        };
    }
}


