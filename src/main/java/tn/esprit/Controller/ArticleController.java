package tn.esprit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Entity.Article;
import tn.esprit.Service.ArticleService;

@RestController
@RequestMapping("/api/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping("/ajouter")
    public Article ajouterArticleEtCategories(Article a) {
        return articleService.ajouterArticleEtCategories(a);
    }
}
