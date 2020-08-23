package dev.article.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.article.entite.Article;
@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
