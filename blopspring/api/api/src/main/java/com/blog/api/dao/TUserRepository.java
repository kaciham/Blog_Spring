package com.blog.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.api.entity.TUser;

public interface TUserRepository extends JpaRepository<TUser,Long> {
    
}
