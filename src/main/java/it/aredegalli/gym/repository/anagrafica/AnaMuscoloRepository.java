package it.aredegalli.gym.repository.anagrafica;

import it.aredegalli.gym.model.anagrafica.AnaMuscolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnaMuscoloRepository extends JpaRepository<AnaMuscolo, Long> {

    @Query("""
                SELECT m 
                FROM AnaMuscolo m
                JOIN AnaLnkMuscoloDistretto lnk ON m = lnk.muscolo
                WHERE lnk.distretto.id IN :idDistretti
                ORDER BY lnk.distretto.id
            """)
    List<AnaMuscolo> findAnaMuscoli(@Param("idDistretti") List<Long> idDistretti);


}
