package com.kob.backend.Controller.PKController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/pk/getinfo/")
public class getBotInfo {
    @RequestMapping("/")
    public String getBotInfo1(){
        return "info";
    }
    @RequestMapping("hi/")
    public List<Map<String, String>> getBotInfo2(){
        List<Map<String, String>> info = new LinkedList<>();
        Map<String, String> bot1 = new HashMap<>();
        Map<String, String> bot2 = new HashMap<>();
        bot1.put("name", "bot1");
        bot1.put("rating", "123");
        bot2.put("name", "bot2");
        bot2.put("rating", "133");
        info.add(bot1);
        info.add(bot2);
        return info;
    }
}
