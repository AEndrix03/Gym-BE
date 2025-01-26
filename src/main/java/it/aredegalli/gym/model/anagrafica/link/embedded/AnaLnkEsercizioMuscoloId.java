package it.aredegalli.gym.model.anagrafica.link.embedded;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class AnaLnkEsercizioMuscoloId implements Serializable {

    @Column(name = "id_ana_esercizio")
    private Long idAnaEsercizio;

    @Column(name = "id_ana_muscolo")
    private Long idAnaMuscolo;

}
