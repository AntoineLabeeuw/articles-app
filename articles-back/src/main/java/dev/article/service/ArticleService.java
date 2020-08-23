package dev.article.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import dev.article.entite.Article;
import dev.article.repository.ArticleRepository;

/** Couche service pour l'ajout et la lecture des articles
 * @author antoinelabeeuw
 *
 */
@Service
public class ArticleService {
	/** repository */
	private ArticleRepository articleRepo;

	/**
	 * @param articleRepo : le repository
	 */
	public ArticleService(ArticleRepository articleRepo) {
		super();
		this.articleRepo = articleRepo;
	}
	@Transactional
	public Article sauvegarderArticle(String libelle, Float prix) {
		Article article = new Article();
		article.setLibelle(libelle);
		article.setPrix(prix);
		return articleRepo.save(article);
	}
	
	public List<Article> listerArticle(){
		return articleRepo.findAll();
	}
	
	
	
	

}
