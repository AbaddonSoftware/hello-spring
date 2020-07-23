package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello, Spring";
    }

    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, Spring";
    }

    @RequestMapping(value = "hello", method = { RequestMethod.GET, RequestMethod.POST })
    public String helloWithQueryParameter(@RequestParam String name, Model model) {
        String greeting = "Hello " +name+ "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }

    @GetMapping("{name}")
    public String helloWithPathParameter(@PathVariable String name) {

        return "Hello " +name+ "!!";

    }

    @GetMapping("form")
    public String helloForm() {
        return "form";
    }
    @GetMapping("hello-names")
    public String helloNames(Model model) {
        List<String> names = Arrays.asList("Tom",
                                           "Don't",
                                           "Care");
        model.addAttribute("names", names);
        return "hellolist";
    }



}
