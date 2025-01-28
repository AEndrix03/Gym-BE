package it.aredegalli.gym.model.anagrafica.link.embedded;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class AnaLnkMuscoloDistrettoId implements Serializable {

    @Column(name = "id_ana_muscolo")
    private Long idAnaMuscolo;

    @Column(name = "id_ana_distretto")
    private Long idAnaDistretto;

}
