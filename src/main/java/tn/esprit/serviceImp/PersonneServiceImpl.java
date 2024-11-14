package tn.esprit.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.Entity.Personne;
import tn.esprit.Repository.PersonneRepository;
import tn.esprit.Service.PersonneService;

@Service
public class PersonneServiceImpl implements PersonneService {
    @Autowired
    private PersonneRepository personneRepository;

    @Override
    public Personne ajouterPersonne(Personne p) {
        return personneRepository.save(p);
    }
}
