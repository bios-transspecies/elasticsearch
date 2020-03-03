package org.michalbrzezinski.elastic;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "blog", type = "article")
public class Article {
    @Id private String id;
    private String title;
}