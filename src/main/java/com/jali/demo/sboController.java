package com.jali.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class sboController {
    @RequestMapping("/test")
    
    public String Sbo()
    {
        return "jali first application";
    }
}
