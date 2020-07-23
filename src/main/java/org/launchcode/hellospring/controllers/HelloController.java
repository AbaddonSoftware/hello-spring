package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("hello")
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello, Spring";
    }

    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, Spring";
    }

    @RequestMapping(method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public String helloWithQueryParameter(@RequestParam String name) {
        return "Hello " +name+ "!!";

    }

    @GetMapping("{name}")
    @ResponseBody
    public String helloWithPathParameter(@PathVariable String name) {
        return "Hello " +name+ "!!";

    }

    @GetMapping("form")
    public String helloForm() {
        return "form";
    }



}
