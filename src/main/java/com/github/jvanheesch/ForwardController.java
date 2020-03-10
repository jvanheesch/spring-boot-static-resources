package com.github.jvanheesch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ForwardController {
    @GetMapping("/range/**")
    public String forwardRange() {
        return "forward:/my-angular-app/dist/index.html";
    }

    @GetMapping("/range/assets/**")
    public String forwardAssets(HttpServletRequest request) {
        String assetsPath = request.getServletPath().replaceFirst("/range", "");
        return "forward:/my-angular-app/dist" + assetsPath;
    }

    @GetMapping("/imon")
    public String imon() {
        return "imon";
    }
}
