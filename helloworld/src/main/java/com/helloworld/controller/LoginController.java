package com.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@RestController
public class LoginController {



    @GetMapping("/login")
    public String login(HttpSession session, @RequestParam String name) {
        session.setAttribute("name" , name);
        return "saved.";
    }

    @GetMapping("/myname")
    public String login(HttpSession session) {
        String myName = (String) session.getAttribute("name");
        return myName;
    }
}

