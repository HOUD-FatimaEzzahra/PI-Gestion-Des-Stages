package ma.enset.gestiondesstages.services;

import ma.enset.gestiondesstages.models.EncadrantProfessionnel;
import ma.enset.gestiondesstages.repositories.EncadrantProRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EncadrantProImpl implements EncadrantProService{


    private EncadrantProRepository encadrantProRepository;
    public EncadrantProImpl(EncadrantProRepository encadrantProRepository) {
        this.encadrantProRepository = encadrantProRepository;
    }

    @Override
    public EncadrantProfessionnel saveEncadrantPro(EncadrantProfessionnel encadrantPro) {
        return encadrantProRepository.save(encadrantPro);
    }

    @Override
    public EncadrantProfessionnel getEncadrantPro(String id) {
        return encadrantProRepository.findById(id).get();
    }

    @Override
    public EncadrantProfessionnel updateEncadrantPro(EncadrantProfessionnel encadrantProfessionnel , String id) {

        EncadrantProfessionnel encPro
                = encadrantProRepository.findById(id)
                .get();

        encPro.setNom(encadrantProfessionnel.getNom());
        encPro.setPrenom(encadrantProfessionnel.getPrenom());
        encPro.setPoste(encadrantProfessionnel.getPoste());
        encPro.setService(encadrantProfessionnel.getService());
        encPro.setStages(encadrantProfessionnel.getStages());
        return encadrantProRepository.save(encPro);
    }

    @Override
    public void deleteEncadrantPro(String id) {
        encadrantProRepository.deleteById(id);
    }

    @Override
    public List<EncadrantProfessionnel> listEncadrantsPro() {
        return encadrantProRepository.findAll();
    }
}
