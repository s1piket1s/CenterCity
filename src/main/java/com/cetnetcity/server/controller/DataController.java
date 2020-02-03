package com.cetnetcity.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.security.GeneralSecurityException;

@Controller
@RequestMapping("/data")
public class DataController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getData(ModelMap model) throws IOException, GeneralSecurityException {
        return com.cetnetcity.server.gsheet.SheetsGoogle.Method();

    }
}
