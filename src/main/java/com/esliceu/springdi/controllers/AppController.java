package com.esliceu.springdi.controllers;

import com.esliceu.springdi.models.Person;
import com.esliceu.springdi.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AppController {
    @Autowired
    MyService service;

    @RequestMapping("/test/{num1}/{num2}")
    public String test(@PathVariable int num1,
                       @PathVariable int num2,
                       Model m){
        m.addAttribute("message",num1+num2);
        return "test";
    }
    @RequestMapping("/hello")
    public String hello(Model model, HttpSession session){
        Object o = session.getAttribute("counter");
        Integer i = 1;
        if(o == null){
            session.setAttribute("counter",1);
        }else{
            i = (Integer) o;
            i++;
            session.setAttribute("counter",i);
        }
        model.addAttribute("counter", i);
        return "hello";
    }
    @GetMapping("/test2")
    @ResponseBody
    public String test2(){
        return "Hello from spring";
    }

    @GetMapping("/private/inside")
    public String inside(){
        return "inside";
    }
    @GetMapping("/newPerson")
    public String newPerson(){
        return "personform";
    }
    @PostMapping("/newPerson")
    @ResponseBody
    public String newPersonPost(String name){
        service.newPerson(name);
        return "ok";
    }

    @GetMapping("/allPersons")
    public String allPersons(Model model){
        List<Person> persons = service.allPersons();
        model.addAttribute("persons",persons);
        return "allpersons";
    }
}
