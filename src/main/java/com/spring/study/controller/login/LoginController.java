package com.spring.study.controller.login;

import com.spring.study.entity.User;
import com.spring.study.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping("/loginpage")
    public ModelAndView login(){
        return new ModelAndView("login/login");
    }

    @PostMapping("/login")
    public String loginAdmin(User user){
        if(loginService.successLogin(user) != 0)
            return "success";

        return null;
    }
}
