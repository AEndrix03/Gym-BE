package it.aredegalli.gym.controller.anagrafica;

import it.aredegalli.gym.dto.anagrafica.DistrettoDto;
import it.aredegalli.gym.service.anagrafica.DistrettoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/distretto")
public class DistrettoController {

    @Autowired
    private DistrettoService distrettoService;

    @GetMapping()
    public List<DistrettoDto> getDistretti() {
        log.info("getDistretti");
        return this.distrettoService.getDistretti();
    }

}
