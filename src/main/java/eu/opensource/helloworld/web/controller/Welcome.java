package eu.opensource.helloworld.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping()
@Controller
public class Welcome {
    
    @GetMapping("/")
    public String welcome() {

        return "welcome";
    }
}
