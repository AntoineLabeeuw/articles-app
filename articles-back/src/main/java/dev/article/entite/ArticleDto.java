package dev.article.entite;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ArticleDto {
	@NotBlank
	private String libelle;
	@NotNull
	private Float prix;
	/** constructeur */
	public ArticleDto() {
		super();
	}
	/** @return the libelle */
	public String getLibelle() {
		return libelle;
	}
	/** @param libelle the libelle to set */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	/** @return the prix */
	public Float getPrix() {
		return prix;
	}
	/** @param prix the prix to set */
	public void setPrix(Float prix) {
		this.prix = prix;
	}

}
