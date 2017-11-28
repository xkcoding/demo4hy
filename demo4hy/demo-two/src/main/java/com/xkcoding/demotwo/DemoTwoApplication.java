package com.xkcoding.demotwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@Controller
public class DemoTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoTwoApplication.class, args);
    }

    @GetMapping("/index.html")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", "黄宇");
        mv.setViewName("index");
        return mv;
    }
}
