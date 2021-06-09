package com.example.demo;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
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
    
    @RequestMapping("addHackathon")
    public ModelAndView addHackathon(@RequestParam("hackathon") String hackathon)
    {
        String s = "hackathon added: " + hackathon;
        System.out.println(s);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("editHackathons.html");
        mv.addObject("editHackathon", s);
        return mv;
    }
    
    @RequestMapping("removeHackathon")
    public String removeHackathon(@RequestParam("hackathon") String hackathon)
    {
        System.out.println("hackathon removed: " + hackathon);
        return "index.html";
    }
}
