package com.blog.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("")
public class DefaultController {

    @RequestMapping(value = "/")
    public int home(){
        return 0;
    }
}
