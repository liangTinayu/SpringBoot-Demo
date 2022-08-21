package com.lty.controller;

import com.lty.dao.StudentDao;
import com.lty.entity.Student;
import com.lty.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class MyController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/query")
    @ResponseBody
    public  String doQuery(Integer id){
        System.out.println("---controller---id:"+id);
       Student student = studentService.queryStudent(id);
        System.out.println(student.toString());
        return  student.toString();
    }


}
