package com.blog.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.blog.api.entity.TComment;

public interface TCommentRepository extends JpaRepository<TComment, Long>{
    
}
