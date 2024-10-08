package com.pio.controller;

import com.pio.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private UserService userService;

    private List<Student> students = new ArrayList<>(List.of(
            new Student(1,"Madhu",19),
            new Student(2,"Goransh",12)
    ));

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
     return (CsrfToken) request.getAttribute("_csrf");   // getAttribute gives obj but we need csrf token thats why we need typecasting
    }

    @GetMapping("/students")
    public List<Student> getUser(){
        return students;
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        students.add(student);
        return student;
    }

}
/*
  @GetMapping("/user")
    public String showForm() {
        return "Home Page";
//        model.addAttribute("user", new User());
//        return "signup.html";
    }

//    @PostMapping("/user")
//    public ModelAndView submitForm(@Validated @ModelAttribute("user") UserDto userDto, BindingResult result, ModelAndView model) {
//        model.setViewName("signup.html");
//        if (result.hasErrors()) {
//            model.addObject("message", "Error!");
//            return model;
//        }
//        userService.save(userDto);
//        model.addObject("message", "User successfully registered!");
//        return model;
//    }
 */
