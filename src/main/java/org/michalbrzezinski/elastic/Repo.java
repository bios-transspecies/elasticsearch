package org.michalbrzezinski.elastic;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface Repo extends ElasticsearchRepository<Article, String> {

    Page<Article> findByTitle(String name, Pageable pageable);

}
