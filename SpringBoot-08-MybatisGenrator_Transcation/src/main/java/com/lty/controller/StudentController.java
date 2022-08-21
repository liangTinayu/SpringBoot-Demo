package com.lty.controller;

import com.lty.model.Student;
import com.lty.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class StudentController {
    @Resource
    private StudentService studentService;

    @RequestMapping("/addStu")
    public  void addStudent(String name,Integer age){
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        studentService.addStudent(student);
        System.out.println("controller 完成");

    }
}
