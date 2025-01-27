package it.aredegalli.gym.model.anagrafica;

import it.aredegalli.gym.dto.anagrafica.IAnagrafica;
import it.aredegalli.gym.dto.anagrafica.MuscoloDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ana_muscolo")
@Entity
public class AnaMuscolo implements IAnagrafica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Override
    public MuscoloDto toAnagrafica() {
        return MuscoloDto.builder()
                .id(this.id)
                .nome(this.nome)
                .build();
    }
}
