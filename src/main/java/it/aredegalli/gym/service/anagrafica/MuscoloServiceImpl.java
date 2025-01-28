package it.aredegalli.gym.service.anagrafica;

import it.aredegalli.gym.dto.anagrafica.MuscoloDto;
import it.aredegalli.gym.dto.anagrafica.search.MuscoloSearchDto;
import it.aredegalli.gym.model.anagrafica.AnaMuscolo;
import it.aredegalli.gym.repository.anagrafica.AnaMuscoloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MuscoloServiceImpl implements MuscoloService {

    @Autowired
    private AnaMuscoloRepository muscoloRepository;

    @Override
    public List<MuscoloDto> getMuscoli(MuscoloSearchDto searchDto) {
        return this.muscoloRepository.findAnaMuscoli(
                        searchDto != null ? searchDto.getIdDistretti() : List.of())
                .stream()
                .map(AnaMuscolo::toAnagrafica)
                .toList();
    }


}
