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
    private Long IdCommandeClient;

    public Long getIdCommandeClient() {
        return IdCommandeClient;
    }

    public void setIdCommandeClient(Long idCommandeClient) {
        IdCommandeClient = idCommandeClient;
    }

}
