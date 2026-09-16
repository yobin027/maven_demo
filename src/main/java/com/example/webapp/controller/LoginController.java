package com.example.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.webapp.domain.Student;
import com.example.webapp.repository.StudentRepository;
import org.springframework.web.bind.annotation.RequestBody;


@SuppressWarnings("unused")
@Controller 
public class LoginController {
    final StudentRepository repo;

  LoginController(StudentRepository repo) {
    this.repo = repo;
  }
@GetMapping("/signin")
public String showLoginPage() {
    return "login.html";
}
@PostMapping("signin")
public String Login(@RequestParam String studentname, @RequestParam String password) {
  Student entity = repo.findByStudentnameAndPassword(studentname, password);
    if (entity == null) {
        return "redirect:/login.html";
    }
    return "redirect:/dashboard.html";
}
@GetMapping("/logout")
public String logout() {
    return "redirect:/index.html";
}

}
