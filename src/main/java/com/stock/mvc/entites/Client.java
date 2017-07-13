package com.stock.mvc.entites;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_client")
    private Long IdClient;

    public Long getIdClient() {
        return IdClient;
    }

    public void setIdClient(Long idClient) {
        IdClient = idClient;
    }

}
