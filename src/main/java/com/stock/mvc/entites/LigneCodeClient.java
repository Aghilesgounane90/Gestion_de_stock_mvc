package com.stock.mvc.entites;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ligne_code_client")
public class LigneCodeClient implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_ligne_code_client")
    private Long idLigneCodeClient;

    public Long getIdLigneCodeClient() {
        return idLigneCodeClient;
    }

    public void setIdLigneCodeClient(Long idLigneCodeClient) {
        this.idLigneCodeClient = idLigneCodeClient;
    }

}
