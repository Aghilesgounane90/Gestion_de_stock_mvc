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
    @Column(name = "Id_ligne_code_client")
    private Long IdLigneCodeClient;

    public Long getIdLigneCodeClient() {
        return IdLigneCodeClient;
    }

    public void setIdLigneCodeClient(Long idLigneCodeClient) {
        IdLigneCodeClient = idLigneCodeClient;
    }

}
