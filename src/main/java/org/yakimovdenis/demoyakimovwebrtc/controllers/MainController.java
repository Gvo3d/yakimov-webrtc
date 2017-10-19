package org.yakimovdenis.demoyakimovwebrtc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.yakimovdenis.demoyakimovwebrtc.models.User;
import org.yakimovdenis.demoyakimovwebrtc.services.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import java.sql.Timestamp;

@Controller
public class MainController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/", "/index"})
    public String home() {
        return "index";
    }

    @RequestMapping(value = {"main"})
    public ModelAndView mainPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", userService.getUser());
        modelAndView.setViewName("main");
        return modelAndView;
    }

    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    public String doLogin(String username){
        userService.setUser(new User(username));
        return "redirect:/main";
    }
}
