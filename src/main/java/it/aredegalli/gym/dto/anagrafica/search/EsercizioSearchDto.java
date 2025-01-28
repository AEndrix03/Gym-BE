package it.aredegalli.gym.dto.anagrafica.search;

import lombok.Data;

import java.util.List;

@Data
public class EsercizioSearchDto {

    private List<Long> idDistretti;
    private List<Long> idMuscoli;

}
