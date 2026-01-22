package com.k8s.project.kubernetes.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/welcome")
    public String Welcome(){
        return "Hii, Welcome...!";
    }

    @GetMapping("/version1")
    public String version1(){
        return "Hello from Version 1 👌";
    }

    @GetMapping("/latestVersion")
    public String version2(){
        return "Hello from kubernetes version 3.0 ...💙";
    }
}
