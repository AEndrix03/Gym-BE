package it.aredegalli.gym.dto.anagrafica;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder(toBuilder = true)
public class EsercizioDto extends AnagraficaDto {

    private String descrizione;
    private Boolean rimosso;

}
