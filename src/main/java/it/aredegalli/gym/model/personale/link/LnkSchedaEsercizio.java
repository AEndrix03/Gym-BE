package it.aredegalli.gym.model.personale.link;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "lnk_scheda_esercizio", schema = "public")
@Entity
public class LnkSchedaEsercizio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "id_scheda")
    private Long idScheda;

    @Column(name = "id_ana_esercizio")
    private Long idAnaEsercizio;

    @Column(name = "serie")
    private Integer serie;

    @Column(name = "ripetizioni")
    private Integer ripetizioni;


}
