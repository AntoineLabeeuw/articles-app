package dev.article.entite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/** classe representant un article
 * @author antoinelabeeuw
 *
 */
@Entity
@Table
public class Article {
	/** identifiant */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	/** libelle */
	private String libelle;
	/** prix */
	private Float prix;
	
	
	/**
	 * @return l'id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id l'id a modifier
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return le libelle
	 */
	public String getLibelle() {
		return libelle;
	}
	/**
	 * @param libelle : le libelle a modifier
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	/**
	 * @return le prix
	 */
	public Float getPrix() { 
		return prix;
	}
	/**
	 * @param prix le prix a modifier
	 */
	public void setPrix(Float prix) {
		this.prix = prix;
	}
	/** constructeur
	 * 
	 */
	public Article() {
		super();
	}
	

}
