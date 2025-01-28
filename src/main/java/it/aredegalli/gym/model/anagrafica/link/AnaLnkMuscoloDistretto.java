package it.aredegalli.gym.model.anagrafica.link;

import it.aredegalli.gym.model.anagrafica.AnaDistretto;
import it.aredegalli.gym.model.anagrafica.AnaMuscolo;
import it.aredegalli.gym.model.anagrafica.link.embedded.AnaLnkMuscoloDistrettoId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ana_lnk_muscolo_distretto", schema = "public")
@Entity
public class AnaLnkMuscoloDistretto {

    @EmbeddedId
    private AnaLnkMuscoloDistrettoId id;

    @ManyToOne
    @MapsId("idAnaMuscolo")
    @JoinColumn(name = "id_ana_muscolo")
    private AnaMuscolo muscolo;

    @ManyToOne
    @MapsId("idAnaDistretto")
    @JoinColumn(name = "id_ana_distretto")
    private AnaDistretto distretto;

}
