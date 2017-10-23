package org.yakimovdenis.demoyakimovwebrtc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.yakimovdenis.demoyakimovwebrtc.models.User;
import org.yakimovdenis.demoyakimovwebrtc.services.UserService;

import javax.servlet.http.HttpServletRequest;

@RestController
public class LoginContoller {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/doLogin", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public User doLogin(@RequestBody User user){
        return userService.setUser(user);
    }

    @RequestMapping(value = "/doLogout", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public User doLogout(@RequestBody User user, HttpServletRequest request){
        System.out.println("Logout!");
        request.getSession().invalidate();
        return userService.getUser();
    }
}
