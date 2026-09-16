package com.example.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.webapp.domain.Student;
import com.example.webapp.repository.StudentRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RequestMapping("/signup")
@SuppressWarnings("unused")
@Controller 
public class RegisterController {
    final StudentRepository repo;

  RegisterController(StudentRepository repo) {
    this.repo = repo;
  }
@GetMapping
public String DisplaySignup() {
    return "register.html";
}
@PostMapping
public String signup(@ModelAttribute Student student) {
    repo.save(student);
    return "redirect:/index.html";
}
}

