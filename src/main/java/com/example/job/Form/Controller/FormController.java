package com.example.job.Form.Controller;

import com.example.job.Form.Entity.Form;
import com.example.job.Form.Repository.jobRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller

//@RequestMapping("/form")
public class FormController {


    @Autowired
    private jobRepository repo;
    @GetMapping("/")
    public ModelAndView home(){

        return new ModelAndView("index","form",new Form());
    }
    @PostMapping("/register")
    public String register(@Validated @ModelAttribute("form") Form form, HttpSession session){
        System.out.println(form);
        repo.save(form);
        session.setAttribute("message","user register succesfully.");
        return "redirect:/";

    }


}
