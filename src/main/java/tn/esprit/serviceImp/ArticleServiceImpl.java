package tn.esprit.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.Entity.Article;
import tn.esprit.Repository.ArticleRepository;
import tn.esprit.Service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public Article ajouterArticleEtCategories(Article a) {
        return articleRepository.save(a);
    }
}
