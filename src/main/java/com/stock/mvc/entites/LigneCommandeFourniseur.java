package com.stock.mvc.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ligne_commande_fourniseur")
public class LigneCommandeFourniseur implements Serializable {

    @Id
    @GeneratedValue
    private Long idLigneCommandeFourniseur;

    @ManyToOne
    @JoinColumn(name = "idArticle")
    private Article article;

    @ManyToOne
    @JoinColumn(name = "idCommandeFourniseur")
    private CommandeFourniseur commandeFourniseur;

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public CommandeFourniseur getCommandeFourniseur() {
        return commandeFourniseur;
    }

    public void setCommandeFourniseur(CommandeFourniseur commandeFourniseur) {
        this.commandeFourniseur = commandeFourniseur;
    }

    public Long getIdLigneCommandeFourniseur() {
        return idLigneCommandeFourniseur;
    }

    public void setIdLigneCommandeFourniseur(Long idLigneCommandeFourniseur) {
        this.idLigneCommandeFourniseur = idLigneCommandeFourniseur;
    }

}
