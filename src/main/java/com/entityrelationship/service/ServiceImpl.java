package com.entityrelationship.service;

import com.entityrelationship.Service;
import com.entityrelationship.dao.StudentDaoImpl;
import com.entityrelationship.entity.Passport;
import com.entityrelationship.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@org.springframework.stereotype.Service

public class ServiceImpl implements Service {
    @Autowired
    private StudentDaoImpl studentDao;
    @Override
    public Student createStudent(Student student,Passport passport) {
       return studentDao.save(student,passport);

    }

    @Override
    public Student findById(int id) {

        return studentDao.findById(id);
    }

    @Override
    public List<Student> findall() {
        return studentDao.findAll();
    }

    @Override
    public void deletebyid(int id) {
        studentDao.deletebyid(id);
    }

}
