package tn.esprit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.Entity.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
