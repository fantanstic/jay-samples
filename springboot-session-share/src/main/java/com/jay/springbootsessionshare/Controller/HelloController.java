package com.jay.springbootsessionshare.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("hello")
public class HelloController {

    @Value("${server.port}")

    Integer port;
    @GetMapping("/set")
    public String set(HttpSession session){
        session.setAttribute("user", "jay");
        return String.valueOf(port);
    }

    @GetMapping("/get")
    public String get(HttpSession session){
        return session.getAttribute("user") + ":" +port;
    }
}
