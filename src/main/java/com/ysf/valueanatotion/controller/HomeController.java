package com.ysf.valueanatotion.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping
public class HomeController {

    @Value("hard code değer okuması yapar")
    public String value1;
    @Value("${app.name}")
    public String value2;
    @Value("${app.list}")
    public String value3;
    @Value("${app.default:properties dosyasında bulamazsa burdan okur}")
    public String value4;

@GetMapping("/test")
    public String GetValue(){
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
    return null;
    }


}
