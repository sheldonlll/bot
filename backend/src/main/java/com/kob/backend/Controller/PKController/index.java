package com.kob.backend.Controller.PKController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pk/")
public class index {
    @RequestMapping("/")
    public String index() {
        return "index.html";
    }
}
