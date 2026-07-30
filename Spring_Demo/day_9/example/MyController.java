package com.example;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/usersApi")
public class MyController{
    
    private List<String> users = List.of("Prasunamba", "Meher", "Kom");

    @GetMapping
    public List<String> getUsers(){
        
        // this is returning JSON response
        return users; 
    }
}