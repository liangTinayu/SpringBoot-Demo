package com.lty.service.impl;

import com.lty.dao.StudentMapper;
import com.lty.model.Student;
import com.lty.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl  implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Transactional
    public void  addStudent(Student student){
        System.out.println("进入Service方法");
        studentMapper.insert(student);
        //制造一个异常
        //int i = 10/0;
        System.out.println("servie完成-");

    }
}
