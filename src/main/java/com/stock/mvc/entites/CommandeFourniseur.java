package com.stock.mvc.entites;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "commande_fourniseur")
public class CommandeFourniseur implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_commande_fourniseur")
    private Long IdCommandeFourniseur;

    public Long getIdCommandeFourniseur() {
        return IdCommandeFourniseur;
    }

    public void setIdCommandeFourniseur(Long idCommandeFourniseur) {
        IdCommandeFourniseur = idCommandeFourniseur;
    }

}
