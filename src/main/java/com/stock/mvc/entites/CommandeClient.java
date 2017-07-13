package com.stock.mvc.entites;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "commande_client")
public class CommandeClient implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_commande_client")
    private Long idCommandeClient;

    public Long getIdCommandeClient() {
        return idCommandeClient;
    }

    public void setIdCommandeClient(Long idCommandeClient) {
        this.idCommandeClient = idCommandeClient;
    }

}
