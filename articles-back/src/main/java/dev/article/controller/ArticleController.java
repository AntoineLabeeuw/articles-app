package dev.article.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.article.entite.Article;
import dev.article.entite.ArticleDto;
import dev.article.service.ArticleService;

/** couche controller pour l'interaction avec l'utilisateur
 * @author antoinelabeeuw
 *
 */
@RestController
@CrossOrigin
@RequestMapping("articles")
public class ArticleController {
	/** le service */
	private ArticleService articleService;

	/** constructeur
	 * @param articleService
	 */
	public ArticleController(ArticleService articleService) {
		super();
		this.articleService = articleService;
	}
	/** méthode permettant de récupérer tous les articles de la BDD
	 * 
	 * @return la liste des articles 
	 */
	@GetMapping
	public ResponseEntity<?> getAllArticles() {
		return ResponseEntity.status(HttpStatus.OK).body(articleService.listerArticle());
	}
	
	/** Prend en entrée le libelle et le prix d'un article, et l'entre dans la BDD
	 * @param article
	 * @param result
	 * @return le nouvel article
	 */
	@PostMapping
	public ResponseEntity<?> creerCollegue(@RequestBody @Valid ArticleDto article, BindingResult result) {
		if (result.hasErrors()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("tous les champs doivent etre valorises.");
		}
		Article newArticle = articleService.sauvegarderArticle(article.getLibelle(), article.getPrix());
		String body = "article bin crée avec l'Id :" + newArticle.getId();
		return ResponseEntity.status(HttpStatus.OK).body(body);
	}
	
	
	
	
}
