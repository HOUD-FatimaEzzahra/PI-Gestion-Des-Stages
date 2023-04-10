package ma.enset.gestiondesstages.services;

import ma.enset.gestiondesstages.models.EncadrantProfessionnel;

import java.util.List;

public interface EncadrantProService {
    EncadrantProfessionnel saveEncadrantPro(EncadrantProfessionnel encadrantPro);
    EncadrantProfessionnel getEncadrantPro(String id);
    EncadrantProfessionnel updateEncadrantPro(EncadrantProfessionnel encadrantProfessionnel , String id);
    void deleteEncadrantPro(String id);
    List<EncadrantProfessionnel> listEncadrantsPro();
}
