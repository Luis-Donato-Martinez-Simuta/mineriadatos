package com.api.apidemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/status")
    public String status() {
        return "{\n    \"status\":\"200\",\n    \"mensage_global\":\"okey\"\n}";
    }

}


