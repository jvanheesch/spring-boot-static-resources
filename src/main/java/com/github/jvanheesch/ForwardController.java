package com.github.jvanheesch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ForwardController {
    @GetMapping("/range/**")
    public String forwardRange() {
        return "forward:/my-angular-app/dist/index.html";
    }

    @GetMapping("/imon")
    public String imon() {
        return "imon";
    }
}
