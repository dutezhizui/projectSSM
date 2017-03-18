package com.seed.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/3/18.
 */
@Controller
@RequestMapping("/error")
public class ErrorController {
    @RequestMapping("/404")
    public String return404(){
        return "404";
    }
}
