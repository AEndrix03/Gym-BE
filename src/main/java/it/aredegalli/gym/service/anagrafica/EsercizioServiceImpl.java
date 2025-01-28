package it.aredegalli.gym.service.anagrafica;

import it.aredegalli.gym.dto.anagrafica.EsercizioDto;
import it.aredegalli.gym.dto.anagrafica.search.EsercizioSearchDto;
import it.aredegalli.gym.model.anagrafica.AnaEsercizio;
import it.aredegalli.gym.repository.anagrafica.AnaEsercizioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EsercizioServiceImpl implements EsercizioService {

    @Autowired
    private AnaEsercizioRepository esercizioRepository;

    @Override
    public List<EsercizioDto> getEsercizi(EsercizioSearchDto searchDto) {
        return this.esercizioRepository.findAnaEserciziByIdMuscoli(
                        searchDto != null ? searchDto.getIdMuscoli() : null,
                        searchDto != null ? searchDto.getIdDistretti() : null)
                .stream()
                .map(AnaEsercizio::toAnagrafica)
                .toList();
    }

}
