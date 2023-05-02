package com.blog.api.metier;

import java.util.List;

public interface TCommentMetier {
    List<TCommentMetier> list();
    TCommentMetier find(Long Id);
    TCommentMetier save(TCommentMetier repository);
    TCommentMetier update(TCommentMetier repository);
    boolean delete (Long id);
}
