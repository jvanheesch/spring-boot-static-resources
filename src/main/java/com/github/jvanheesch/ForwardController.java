package com.github.jvanheesch;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ForwardController {
    @GetMapping("/range/**")
    public ModelAndView forward() {
        return new ModelAndView("forward:/test.html");
    }
}
