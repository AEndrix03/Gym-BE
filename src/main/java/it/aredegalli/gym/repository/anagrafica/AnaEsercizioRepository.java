package it.aredegalli.gym.repository.anagrafica;


import it.aredegalli.gym.model.anagrafica.AnaEsercizio;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnaEsercizioRepository {

    @Query("SELECT e.* FROM ana_esercizio e JOIN ana_lnk_esercizio_muscolo lnk ON e.id = lnk.id_ana_esercizio JOIN ana_lnk_muscolo_distretto lnk2 ON lnk.id_ana_muscolo = lnk2.id_ana_muscolo WHERE (:idMuscoli IS NULL OR lnk.id_ana_muscolo = ANY(:idMuscoli)) AND (:idDistretti IS NULL OR lnk2.id_ana_distretto = ANY(:idDistretti)) AND (:nome IS NULL OR e.nome ILIKE '%' || :nome || '%') AND (e.rimosso IS NULL OR e.rimosso IS FALSE) ORDER BY lnk2.id_ana_distretto")
    List<AnaEsercizio> findAnaEserciziByIdMuscoli(List<Long> idMuscoli, List<Long> idDistretti, String nome);


}
