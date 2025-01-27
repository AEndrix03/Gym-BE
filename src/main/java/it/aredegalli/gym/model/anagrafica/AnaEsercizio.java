package it.aredegalli.gym.model.anagrafica;

import it.aredegalli.gym.dto.anagrafica.EsercizioDto;
import it.aredegalli.gym.dto.anagrafica.IAnagrafica;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ana_esercizio")
@Entity
public class AnaEsercizio implements IAnagrafica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descrizione")
    private String descrizione;

    @Column(name = "rimosso")
    private Boolean rimosso;

    @Override
    public EsercizioDto toAnagrafica() {
        return EsercizioDto.builder()
                .id(this.id)
                .nome(this.nome)
                .descrizione(this.descrizione)
                .rimosso(this.rimosso)
                .build();
    }

}
