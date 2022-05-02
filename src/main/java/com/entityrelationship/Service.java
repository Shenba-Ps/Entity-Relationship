package com.entityrelationship;

import com.entityrelationship.entity.Passport;
import com.entityrelationship.entity.Student;

import java.util.List;

public interface Service {
    public Student createStudent(Student student,Passport passport);
    public Student findById(int id);
    public List<Student> findall();
    public void deletebyid(int id);
}
