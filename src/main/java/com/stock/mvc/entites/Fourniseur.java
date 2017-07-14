package com.stock.mvc.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "fourniseur")
public class Fourniseur implements Serializable {

    @Id
    @GeneratedValue
    private Long idFourniseurt;

    private String nom;

    private String prenom;

    private String adresse;

    private String mail;

    private String photo;

    @OneToMany(mappedBy = "fourniseur")
    private List<CommandeFourniseur> commandeFourniseurs;

    public Fourniseur() {
        super();
    }

    public Long getIdFourniseurt() {
        return idFourniseurt;
    }

    public void setIdFourniseurt(Long idFourniseurt) {
        this.idFourniseurt = idFourniseurt;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<CommandeFourniseur> getCommandeFourniseurs() {
        return commandeFourniseurs;
    }

    public void setCommandeFourniseurs(List<CommandeFourniseur> commandeFourniseurs) {
        this.commandeFourniseurs = commandeFourniseurs;
    }

}
