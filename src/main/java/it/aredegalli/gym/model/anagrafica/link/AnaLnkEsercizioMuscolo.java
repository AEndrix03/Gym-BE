package it.aredegalli.gym.model.anagrafica.link;

import it.aredegalli.gym.model.anagrafica.AnaEsercizio;
import it.aredegalli.gym.model.anagrafica.AnaMuscolo;
import it.aredegalli.gym.model.anagrafica.link.embedded.AnaLnkEsercizioMuscoloId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ana_lnk_esercizio_muscolo", schema = "public")
@Entity
public class AnaLnkEsercizioMuscolo {

    @EmbeddedId
    private AnaLnkEsercizioMuscoloId id;

    @ManyToOne
    @MapsId("idAnaMuscolo")
    @JoinColumn(name = "id_ana_muscolo")
    private AnaMuscolo muscolo;

    @ManyToOne
    @MapsId("idAnaEsercizio")
    @JoinColumn(name = "id_ana_esercizio")
    private AnaEsercizio esercizio;

}
