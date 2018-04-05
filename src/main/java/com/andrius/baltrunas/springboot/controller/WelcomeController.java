package com.andrius.baltrunas.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by andriusbaltrunas on 4/5/2018.
 */
@Controller
public class WelcomeController {

    private static final String WELCOME_PAGE_PATH = "welcome";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String initWelcomePage() {
        return WELCOME_PAGE_PATH;
    }
}
