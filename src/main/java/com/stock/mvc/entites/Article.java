package com.stock.mvc.entites;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "article")
public class Article implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_article")
    private Long IdArticle;

    public Long getIdArticle() {
        return IdArticle;
    }

    public void setIdArticle(Long idArticle) {
        IdArticle = idArticle;
    }
}
