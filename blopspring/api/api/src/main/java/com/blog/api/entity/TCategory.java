package com.blog.api.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "t_category")

public class TCategory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title; 
    private String description;
    private Date save;
    
    
}
