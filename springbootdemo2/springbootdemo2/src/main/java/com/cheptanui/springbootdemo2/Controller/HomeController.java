package com.cheptanui.springbootdemo2.Controller;

import com.cheptanui.springbootdemo2.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

    @GetMapping("/user")
    public User getUser(){
        User user1 = new User(1, "Ronoh", "ronoh@gmail.com");
        return user1;
    }

    @GetMapping("/{id1}/{id2}")
    public String pathVariable(@PathVariable int id1, @PathVariable("id2") int idw){
        return "The path variable id is :" + id1 + ":" + idw;
    }

    @GetMapping("/requestParam")
    public String requestParams(@RequestParam String name, @RequestParam(required = false, defaultValue = "") String email){
        return "The name is : " + name + " and email is : " + email;
    }
}
