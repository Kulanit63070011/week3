package com.example.week3;

import org.springframework.web.bind.annotation.*;
import java.util.Random;
import java.lang.Math;

@RestController
public class GeneratePasswordService {
    @RequestMapping(path = "{name:[a-z]+}.generate", method = RequestMethod.GET)
    public String generate(@PathVariable("name") String name) {
        Random ran = new Random();
        return "Hi, " + name + "\n" + "Your new password is " + Math.abs(ran.nextInt());

    }
}
