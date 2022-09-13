package com.example.week3;

import org.springframework.web.bind.annotation.*;

@RestController
public class MathService {
    @RequestMapping(value = "/add/{name1}/{name2}", method = RequestMethod.GET)
    public String add(@PathVariable("name1") Double name1, @PathVariable("name2") Double name2) {
        return Double.toString(name1 + name2);
    }
    @RequestMapping(value = "/minus/{name1}/{name2}", method = RequestMethod.GET)
    public String minus(@PathVariable("name1") Double name1, @PathVariable("name2") Double name2) {
        return Double.toString(name1 - name2);
    }
    @RequestMapping(value = "/multiply", method = RequestMethod.GET)
    public String multiply(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return Double.toString(num1*num2);
    }
    @RequestMapping(value = "/divide", method = RequestMethod.GET)
    public String divide(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return Double.toString(num1/num2);
    }
}
