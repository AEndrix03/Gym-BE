package it.aredegalli.gym.service.anagrafica;

import it.aredegalli.gym.dto.anagrafica.EsercizioDto;
import it.aredegalli.gym.dto.anagrafica.search.EsercizioSearchDto;

import java.util.List;

public interface EsercizioService {
    List<EsercizioDto> getEsercizi(EsercizioSearchDto searchDto);
}
