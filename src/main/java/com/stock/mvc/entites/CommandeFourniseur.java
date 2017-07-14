package com.stock.mvc.entites;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "commande_fourniseur")
public class CommandeFourniseur implements Serializable {

    @Id
    @GeneratedValue
    private Long idCommandeFourniseur;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCommande;

    @ManyToOne
    @JoinColumn(name = "idFourniseur")
    private Fourniseur fourniseur;

    @OneToMany(mappedBy = "commandeFourniseur")
    private List<LigneCommandeFourniseur> ligneCommandeFourniseurs;

    public Long getIdCommandeFourniseur() {
        return idCommandeFourniseur;
    }

    public void setIdCommandeFourniseur(Long idCommandeFourniseur) {
        this.idCommandeFourniseur = idCommandeFourniseur;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Fourniseur getFourniseur() {
        return fourniseur;
    }

    public void setFourniseur(Fourniseur fourniseur) {
        this.fourniseur = fourniseur;
    }

    public List<LigneCommandeFourniseur> getLigneCommandeFourniseurs() {
        return ligneCommandeFourniseurs;
    }

    public void setLigneCommandeFourniseurs(List<LigneCommandeFourniseur> ligneCommandeFourniseurs) {
        this.ligneCommandeFourniseurs = ligneCommandeFourniseurs;
    }

}
