package tn.esprit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.Entity.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
