package tn.esprit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.Entity.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Long> {
}
