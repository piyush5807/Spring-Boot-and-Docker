package com.example.demodocker.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @GetMapping("/docker")
    public String helloDocker(){
        return "Hello from docker controller";
    }

}
