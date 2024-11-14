package tn.esprit.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomArticle;

    @Enumerated(EnumType.STRING)
    private Etat etat;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Categorie> categories;
}
