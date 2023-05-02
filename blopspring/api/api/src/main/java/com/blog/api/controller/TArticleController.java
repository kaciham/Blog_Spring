package com.blog.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.blog.api.entity.TArticle;
import com.blog.api.impl.TArticleMetierImpl;

@Controller
@RequestMapping(value ="/api/article", method=RequestMethod.GET)
public class TArticleController {

    @Autowired private TArticleMetierImpl articleMetier;
    
    @GetMapping(value = "/list/test")
    @ResponseBody
    public String test(Model model){
        return "test";
    }

    @RequestMapping(value ="/list", method= RequestMethod.GET)
    @ResponseBody
    public String list(){

        List<TArticle> articles = articleMetier.list();
        return "articles";
    }

}
