package com.example.webapp1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("/home")
   // @GetMapping("home")
    // @ResponseBody
    public ModelAndView home(User user)
    {
        ModelAndView mv=new ModelAndView();
        mv.addObject("obj",user);
        mv.setViewName("home");
        System.out.println("I am in home page" + user);
       return mv;
    }
}
