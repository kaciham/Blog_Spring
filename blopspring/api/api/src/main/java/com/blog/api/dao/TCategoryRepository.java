package com.blog.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.api.entity.TCategory;

public interface TCategoryRepository extends JpaRepository <TCategory, Long>{

    
}
