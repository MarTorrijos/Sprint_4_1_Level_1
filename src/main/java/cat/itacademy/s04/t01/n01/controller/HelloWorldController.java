package cat.itacademy.s04.t01.n01.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String greet1(@RequestParam(defaultValue = "UNKNOWN") String name) {
        return "Hola, " + name + ". Estás ejecutando un proyecto Maven";
    }

    @GetMapping(value = {"/HelloWorld2", "/HelloWorld2/{name}"})
    public String greet2(@PathVariable(required = false) String name) {
        return "Hola, " + name + ". Estás ejecutando un proyecto Maven";
    }

}