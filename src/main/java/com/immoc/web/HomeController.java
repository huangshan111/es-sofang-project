package com.immoc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by huangshan11 on 2018/7/14.
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/403")
    public String error403(){
        return "403";
    }

    @GetMapping("/404")
    public String error404(){
        return "404";
    }

    @GetMapping("/500")
    public String error500(){
        return "500";
    }
}
