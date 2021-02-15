package com.dvdrental.webStore.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    
    @RequestMapping(value={"/", "/actors", "/films", "/films/{id}"})
    public String index(){
        return "index";
    }
}
