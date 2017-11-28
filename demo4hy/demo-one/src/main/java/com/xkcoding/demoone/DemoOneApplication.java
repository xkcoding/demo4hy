package com.xkcoding.demoone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:8080")
@SpringBootApplication
@RestController
public class DemoOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoOneApplication.class, args);
    }

    @GetMapping("/index.json")
    public Map index() {
        Map ret = new HashMap();
        ret.put("name", "黄宇");
        return ret;
    }
}
