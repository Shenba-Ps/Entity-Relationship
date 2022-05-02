package com.entityrelationship.dao;

import com.entityrelationship.entity.Passport;
import com.entityrelationship.entity.Student;

import java.util.List;

public interface StudentDao {
    public Student save(Student student, Passport passport);
    public Student findById(int id);
    public List<Student> findAll();
    public Student updateStudentById(Student student);
    public void deletebyid(int id);
}
