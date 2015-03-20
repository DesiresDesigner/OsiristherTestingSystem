package ru.osiristher.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.osiristher.web.service.ResultService;

/**
 * Created by DesiresDesigner on 23.02.15.
 */



@Controller
@RequestMapping(value = "/result", method = {RequestMethod.POST})
public class ResultController {

    @Autowired
    ResultService resultService;

}
