package it.aredegalli.gym.repository.anagrafica;

import it.aredegalli.gym.model.anagrafica.AnaMuscolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnaMuscoloRepository extends JpaRepository<AnaMuscolo, Long> {

    @Query("SELECT m.* FROM ana_muscolo m JOIN ana_lnk_muscolo_distretto lnk ON m.id = lnk.id_ana_muscolo WHERE lnk.id_ana_distretto IN (:idDistretti) AND m.nome ILIKE '%' || :nome || '%' ORDER BY lnk.id_ana_distretto")
    List<AnaMuscolo> findAnaMuscoli(List<Long> idDistretti, String nome);

}
