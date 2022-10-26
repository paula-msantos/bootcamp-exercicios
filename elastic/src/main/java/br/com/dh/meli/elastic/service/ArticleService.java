package br.com.dh.meli.elastic.service;

import br.com.dh.meli.elastic.model.Article;
import br.com.dh.meli.elastic.repository.ArticleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService implements IArticleService{
    @Autowired
    private ArticleRepo repo;

    @Override
    public Article save(Article article) {
        return repo.save(article);
    }
}
