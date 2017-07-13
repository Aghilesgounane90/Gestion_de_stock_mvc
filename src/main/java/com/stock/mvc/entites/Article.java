package com.stock.mvc.entites;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "article")
public class Article implements Serializable {

    @Id
    @GeneratedValue
    private Long idArticle;

    private String codeArticle;

    private String designation;

    private BigDecimal prixunitaireHT;

    private BigDecimal tauxTva;

    private BigDecimal prixunitaireTTC;

    private String photo;

    @ManyToOne
    @JoinColumn(name = "idCategorie")
    private Categorie categorie;

    public Long getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(Long idArticle) {
        this.idArticle = idArticle;
    }

    public String getCodeArticle() {
        return codeArticle;
    }

    public void setCodeArticle(String codeArticle) {
        this.codeArticle = codeArticle;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public BigDecimal getPrixunitaireHT() {
        return prixunitaireHT;
    }

    public void setPrixunitaireHT(BigDecimal prixunitaireHT) {
        this.prixunitaireHT = prixunitaireHT;
    }

    public BigDecimal getTauxTva() {
        return tauxTva;
    }

    public void setTauxTva(BigDecimal tauxTva) {
        this.tauxTva = tauxTva;
    }

    public BigDecimal getPrixunitaireTTC() {
        return prixunitaireTTC;
    }

    public void setPrixunitaireTTC(BigDecimal prixunitaireTTC) {
        this.prixunitaireTTC = prixunitaireTTC;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

}
