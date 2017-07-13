package com.stock.mvc.entites;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categorie")
public class Categorie implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_categorie")
    private Long IdCategorie;

    public Long getIdCategorie() {
        return IdCategorie;
    }

    public void setIdCategorie(Long idCategorie) {
        IdCategorie = idCategorie;
    }

}
