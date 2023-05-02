package com.blog.api.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
// import lombok.Builder;
// import lombok.Getter;
import lombok.NoArgsConstructor;
// import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
// @Builder
// @Getter
// @Setter
@Entity
@Table(name= "t_article")
public class TArticle implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String description;
    private Date save;

    

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getSave() {
        return save;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSave(Date save) {
        this.save = save;
    }

    @Override
    public String toString() {
        return "TArticle [id=" + id + ", title=" + title + ", description=" + description + ", save=" + save
                + ", fk_category=" + fk_category + ", fk_user=" + fk_user + "]";
    }

    @ManyToOne
    @JoinColumn(name= "fk_category")
    private TCategory fk_category;

    @ManyToOne
    @JoinColumn(name = "fk_user")
    private TUser fk_user;
}
