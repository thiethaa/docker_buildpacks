package com.thiethaa.docker_buildpacks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/claud-native")
public class Controller {
    @GetMapping("/hello/{name}")
    public String greeting(@PathVariable("name") String name){

        return "Heloo "+ name+ " Welcome to Cloud Native World and This is My BuildPack docker Image....";

    }
}
