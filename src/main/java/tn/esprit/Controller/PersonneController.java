package tn.esprit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Entity.Personne;
import tn.esprit.Service.PersonneService;

@RestController
@RequestMapping("/api/personne")
public class PersonneController {

    @Autowired
    private PersonneService personneService;

    @PostMapping("/ajouter")
    public Personne ajouterPersonne(Personne p) {
        return personneService.ajouterPersonne(p);
    }
}
