package it.aredegalli.gym.controller.anagrafica;

import it.aredegalli.gym.dto.anagrafica.EsercizioDto;
import it.aredegalli.gym.dto.anagrafica.search.EsercizioSearchDto;
import it.aredegalli.gym.service.anagrafica.EsercizioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/esercizio")
public class EsercizioController {

    @Autowired
    private EsercizioService esercizioService;

    @GetMapping()
    public List<EsercizioDto> getEsercizi(@RequestParam(required = false) EsercizioSearchDto searchDto) {
        log.info("getEsercizi");
        return this.esercizioService.getEsercizi(searchDto);
    }

}
