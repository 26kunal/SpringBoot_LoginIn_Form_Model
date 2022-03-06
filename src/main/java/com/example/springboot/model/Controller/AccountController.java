package com.example.springboot.model.Controller;

import com.example.springboot.model.Entity.UserData;
import com.example.springboot.model.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountController {

    @Autowired
    public UserService user;

    @RequestMapping(value = "/login")
//    @ResponseBody
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/register")
    public String register(Model model){
        model.addAttribute(new UserData());
        return "register";
    }

    @PostMapping(value = "/savedetails")
    @ResponseBody
    public String saveDetails(UserData userData){

        user.saveDetails(userData);
        System.out.println("saved=.............");
        return "Saved";

    }

    @RequestMapping(value = "/loginServelet")
    public void loginServelet(UserData userdata){



    }
}
