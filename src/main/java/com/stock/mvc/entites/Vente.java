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
    private Long idVente;

    public Long getIdVente() {
        return idVente;
    }

    public void setIdVente(Long idVente) {
        this.idVente = idVente;
    }

}
