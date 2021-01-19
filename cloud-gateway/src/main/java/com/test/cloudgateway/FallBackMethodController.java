package com.test.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod(){
        return "User service is taking Longer time than expected" + "Please try later";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentFallBackMethod(){
        return "Department service is taking Longer time than expected" + "Please try later";
    }
}
