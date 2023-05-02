package com.blog.api.metier;

import java.util.List;

import com.blog.api.dao.TArticleRepository;
import com.blog.api.entity.TArticle;


public interface TArticleMetier {
    List<TArticle> list();
    TArticleRepository find(Long Id);
    TArticleRepository save(TArticleRepository repository);
    TArticleRepository update(TArticleRepository repository);
    boolean delete (Long id);
}
