package com.blog.api.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.api.dao.TCategoryRepository;
import com.blog.api.metier.TCategoryMetier;

@Service
public class TCategoryMetierImpl implements TCategoryMetier {

    @Override
    public boolean delete(Long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public TCategoryRepository find(Long Id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<TCategoryRepository> list() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TCategoryRepository save(TCategoryRepository repository) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TCategoryRepository update(TCategoryRepository repository) {
        // TODO Auto-generated method stub
        return null;
    }


        
}
