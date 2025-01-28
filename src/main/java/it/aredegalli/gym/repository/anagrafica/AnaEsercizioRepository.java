package it.aredegalli.gym.repository.anagrafica;


import it.aredegalli.gym.model.anagrafica.AnaEsercizio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnaEsercizioRepository extends JpaRepository<AnaEsercizio, Long> {

    @Query("""
                SELECT e 
                FROM AnaEsercizio e
                JOIN AnaLnkEsercizioMuscolo lnk ON e = lnk.esercizio
                JOIN AnaLnkMuscoloDistretto lnk2 ON lnk.muscolo = lnk2.muscolo
                WHERE (:idMuscoli IS NULL OR lnk.muscolo.id IN :idMuscoli)
                  AND (:idDistretti IS NULL OR lnk2.distretto.id IN :idDistretti)
                  AND (e.rimosso IS NULL OR e.rimosso = FALSE)
                ORDER BY lnk2.distretto.id
            """)
    List<AnaEsercizio> findAnaEserciziByIdMuscoli(
            @Param("idMuscoli") List<Long> idMuscoli,
            @Param("idDistretti") List<Long> idDistretti
    );


}
