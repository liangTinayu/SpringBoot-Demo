package com.lty.service;

import com.lty.dao.StudentDao;
import com.lty.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.ws.ServiceMode;

//@Component("myStudentServiceImpl")
@Service
public class StudentServiceImpl implements StudentService{
   // @Autowired
   // @Qualifier("studentDao")
    @Resource
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
       this.studentDao = studentDao;
    }



    @Override
    public Student queryStudent(Integer id) {
        System.out.println("service");
         Student student = studentDao.selectById(id);
       return student;

    }
}
