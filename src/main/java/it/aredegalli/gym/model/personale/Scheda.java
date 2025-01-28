package it.aredegalli.gym.model.personale;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "scheda", schema = "public")
@Entity
public class Scheda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "titolo")
    private String titolo;

    @Column(name = "descrizione")
    private String descrizione;

    @Column(name = "data_attivazione_dal")
    private LocalDateTime dataAttivazioneDal;

    @Column(name = "data_attivazione_al")
    private LocalDateTime dataAttivazioneAl;

    @Column(name = "data_creazione")
    private LocalDateTime dataCreazione;

    @Column(name = "data_eliminazione")
    private LocalDateTime dataEliminazione;

    @Column(name = "id_user")
    private Long idUser;

}
