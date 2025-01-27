package it.aredegalli.gym.repository.anagrafica;

import it.aredegalli.gym.model.anagrafica.AnaDistretto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnaDistrettoRepository extends JpaRepository<AnaDistretto, Long> {
}
