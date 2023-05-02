package com.blog.api.metier;

import java.util.List;

public interface TUserMetier {
    List<TUserMetier> list();
    TUserMetier find(Long Id);
    TUserMetier save(TUserMetier repository);
    TUserMetier update(TUserMetier repository);
    boolean delete (Long id);
}
