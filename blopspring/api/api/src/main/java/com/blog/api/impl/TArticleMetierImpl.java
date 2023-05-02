package com.blog.api.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.api.dao.TArticleRepository;
import com.blog.api.entity.TArticle;
import com.blog.api.metier.TArticleMetier;

@Service
public class TArticleMetierImpl implements TArticleMetier {

    @Autowired private TArticleRepository articleRepository;

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public TArticleRepository find(Long Id) {
        return null;
    }
    @Override
    public List<TArticle> list() {

        return articleRepository.findAll();
    }

    @Override
    public TArticleRepository save(TArticleRepository repository) {

        return null;
    }

    @Override
    public TArticleRepository update(TArticleRepository repository) {
        return null;
    }
    
}
