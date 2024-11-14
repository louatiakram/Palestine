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
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomCategorie;

    @ManyToMany(mappedBy = "categories", cascade = CascadeType.ALL)
    private Set<Article> articles;
}
