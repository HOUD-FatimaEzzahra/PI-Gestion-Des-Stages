package ma.enset.gestiondesstages.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class EncadrantProfessionnel extends Encadrant{
    private String service;
    private String poste;
}
