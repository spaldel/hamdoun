package org.example.springhibernateproject.controller;


import org.example.springhibernateproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

    /*
     *
     * on appel les interface
     *
     *
     */

    @Autowired
    private StudentService studentService;

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String showIndex(Model model) {
        System.out.println( studentService.getAllStudentsService());
        model.addAttribute("students", studentService.getAllStudentsService());
        return "index";
    }
}
