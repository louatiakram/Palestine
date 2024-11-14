package tn.esprit.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private LocalDate dateInscri;

    @Enumerated(EnumType.STRING)
    private TypePersonne typePersonne;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Article> articles;
}
