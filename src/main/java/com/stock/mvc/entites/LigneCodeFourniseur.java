package com.stock.mvc.entites;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ligne_code_fourniseur")
public class LigneCodeFourniseur implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_ligne_code_fourniseur")
    private Long IdLigneCodeFourniseur;

    public Long getIdLigneCodeFourniseur() {
        return IdLigneCodeFourniseur;
    }

    public void setIdLigneCodeFourniseur(Long idLigneCodeFourniseur) {
        IdLigneCodeFourniseur = idLigneCodeFourniseur;
    }

}