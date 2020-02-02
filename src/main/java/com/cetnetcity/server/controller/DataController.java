package com.cetnetcity.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/data")
public class DataController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getData(ModelMap model){
        return "My data.";
    }
}
