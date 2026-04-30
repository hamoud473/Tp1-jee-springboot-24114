package com.example.demo.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("webStudentController")
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/call")
    public ResponseEntity<?> call(){
        return ResponseEntity.ok("Yap!");
    }
}