package com.stock.mvc.entites;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ligne_vente")
public class LigneVente implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_ligne_vente")
    private Long LigneVente;

    public Long getLigneVente() {
        return LigneVente;
    }

    public void setLigneVente(Long ligneVente) {
        LigneVente = ligneVente;
    }

}
