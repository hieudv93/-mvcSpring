package com.hivetech.mvc.controller;

import com.hivetech.mvc.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
//    @Autowired
//    private HomeService homeService;
    @RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
    public ModelAndView homePage() {
        //model andView
        ModelAndView mav = new ModelAndView("home");
        return mav;
    }
    @RequestMapping(value = "/springmvc", method = RequestMethod.GET)
    public ModelAndView springMvc() {
        //model andView
        ModelAndView mav = new ModelAndView("springmvc");
        return mav;
    }

}