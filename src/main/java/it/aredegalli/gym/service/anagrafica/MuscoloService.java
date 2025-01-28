package it.aredegalli.gym.service.anagrafica;

import it.aredegalli.gym.dto.anagrafica.MuscoloDto;
import it.aredegalli.gym.dto.anagrafica.search.MuscoloSearchDto;

import java.util.List;

public interface MuscoloService {
    List<MuscoloDto> getMuscoli(MuscoloSearchDto searchDto);
}
