package ru.osiristher.web.controller;

/**
 * Created by DesiresDesigner on 27.02.15.
 */

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

//@RequestMapping("/**")
@Controller
public class ExController {
    //@RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    @RequestMapping("/api")
    @ResponseBody
    public String api() { //ModelMap model
        //model.addAttribute("message", "Hello, Spring!");
        return "API";
    }
/*
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        modelAndView.addObject("message", "Hello, Spring!");
        return modelAndView;
    }*/

    @RequestMapping(value = "/lol", method = RequestMethod.GET)
    public String home(Model model) {

        model.addAttribute("message", "Hello, Spring!");

        return "hello";
    }
}