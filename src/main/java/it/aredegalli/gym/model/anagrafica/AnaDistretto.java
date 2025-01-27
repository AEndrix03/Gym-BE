package it.aredegalli.gym.model.anagrafica;

import it.aredegalli.gym.dto.anagrafica.DistrettoDto;
import it.aredegalli.gym.dto.anagrafica.IAnagrafica;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ana_distretto")
@Entity
public class AnaDistretto implements IAnagrafica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Override
    public DistrettoDto toAnagrafica() {
        return DistrettoDto.builder()
                .id(this.id)
                .nome(this.nome)
                .build();
    }

}
