package it.aredegalli.gym.model.anagrafica.link;

import it.aredegalli.gym.model.anagrafica.link.embedded.AnaLnkEsercizioMuscoloId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ana_lnk_esercizio_muscolo")
@Entity
public class AnaLnkEsercizioMuscolo {

    @EmbeddedId
    private AnaLnkEsercizioMuscoloId id;

}
