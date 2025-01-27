package it.aredegalli.gym.service.anagrafica;

import it.aredegalli.gym.dto.anagrafica.DistrettoDto;
import it.aredegalli.gym.model.anagrafica.AnaDistretto;
import it.aredegalli.gym.repository.anagrafica.AnaDistrettoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrettoServiceImpl implements DistrettoService {

    @Autowired
    private AnaDistrettoRepository distrettoRepository;

    @Override
    public List<DistrettoDto> getDistretti() {
        return this.distrettoRepository.findAll()
                .stream()
                .map(AnaDistretto::toAnagrafica)
                .toList();
    }

}
