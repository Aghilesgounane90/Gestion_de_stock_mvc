package com.stock.mvc.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ligne_commande_client")
public class LigneCommandeClient implements Serializable {

    @Id
    @GeneratedValue
    private Long idLigneCommandeClient;

    @ManyToOne
    @JoinColumn(name = "idArticle")
    private Article article;

    @ManyToOne
    @JoinColumn(name = "idCommandeClient")
    private CommandeClient commandeClient;

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public CommandeClient getCommandeClient() {
        return commandeClient;
    }

    public void setCommandeClient(CommandeClient commandeClient) {
        this.commandeClient = commandeClient;
    }

    public Long getIdLigneCommandeClient() {
        return idLigneCommandeClient;
    }

    public void setIdLigneCommandeClient(Long idLigneCommandeClient) {
        this.idLigneCommandeClient = idLigneCommandeClient;
    }

}
