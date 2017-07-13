package com.stock.mvc.entites;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vente")
public class Vente implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_vente")
    private Long IdVente;

    public Long getIdVente() {
        return IdVente;
    }

    public void setIdVente(Long idVente) {
        IdVente = idVente;
    }

}
