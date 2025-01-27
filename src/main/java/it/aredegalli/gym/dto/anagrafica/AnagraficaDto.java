package it.aredegalli.gym.dto.anagrafica;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder(toBuilder = true)
public abstract class AnagraficaDto {

    private Long id;
    private String nome;

}
