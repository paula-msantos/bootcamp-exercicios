package br.com.dh.meli.elastic.repository;

import br.com.dh.meli.elastic.model.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ArticleRepo extends ElasticsearchRepository<Article, Integer> {
}
