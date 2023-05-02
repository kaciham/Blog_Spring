package com.blog.api.metier;

import java.util.List;

import com.blog.api.dao.TCategoryRepository;

public interface TCategoryMetier {
    List<TCategoryRepository> list();
    TCategoryRepository find(Long Id);
    TCategoryRepository save(TCategoryRepository repository);
    TCategoryRepository update(TCategoryRepository repository);
    boolean delete (Long id);
}
 