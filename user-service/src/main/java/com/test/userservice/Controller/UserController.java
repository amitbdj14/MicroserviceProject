package com.test.userservice.Controller;

import com.test.userservice.Entity.User;
import com.test.userservice.Repository.UserRepository;
import com.test.userservice.Service.UserService;
import com.test.userservice.VO.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("Inside saveUser method");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUser(@PathVariable("id") Long userId){
        log.info("Inside getUser method");
        return userService.findByUserId(userId);
    }
}
