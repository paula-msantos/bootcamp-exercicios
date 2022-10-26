package br.com.dh.meli.elastic.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "blog")
public class Article {
    @Id
    private int id;
    private String title;
}

