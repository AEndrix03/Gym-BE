package it.aredegalli.gym.controller.anagrafica;

import it.aredegalli.gym.dto.anagrafica.MuscoloDto;
import it.aredegalli.gym.dto.anagrafica.search.MuscoloSearchDto;
import it.aredegalli.gym.service.anagrafica.MuscoloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/muscolo")
public class MuscoloController {

    @Autowired
    private MuscoloService muscoloService;

    @GetMapping()
    public List<MuscoloDto> getMuscoli(@RequestParam(required = false) MuscoloSearchDto searchDto) {
        log.info("getMuscoli");
        return this.muscoloService.getMuscoli(searchDto);
    }

}
