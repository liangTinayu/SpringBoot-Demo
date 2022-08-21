package com.lty.service;

import com.lty.entity.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentService {

    //int addStudent(Student student);
    public Student queryStudent(Integer id);

}
