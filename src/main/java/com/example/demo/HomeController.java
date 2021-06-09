package com.example.demo;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController
{
    @RequestMapping()
    public ModelAndView home()
    {
        System.out.println("request accepted");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index.html");
        return mv;
    }
}
