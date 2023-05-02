package com.blog.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

import com.blog.api.entity.TArticle;

public interface TArticleRepository extends JpaRepository <TArticle,Long>{
    
}
