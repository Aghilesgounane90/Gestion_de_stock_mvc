package com.stock.mvc.entites;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mvt_stk")
public class MvtStk implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_mvt_stk")
    private Long idMvtStk;

    public Long getIdMvtStk() {
        return idMvtStk;
    }

    public void setIdMvtStk(Long idMvtStk) {
        this.idMvtStk = idMvtStk;
    }

}
