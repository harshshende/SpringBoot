package com.MicroServiceDemo.MicroServiceDemo;

import com.MicroServiceDemo.MicroServiceDemo.Bean.NameSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    @Autowired
    private NameSender nameSender;
    @GetMapping("/name")
    public NameSender dispalyName(){

        return new NameSender(nameSender.getNum1(), nameSender.getNum2(), nameSender.getAdd());
    }
}
