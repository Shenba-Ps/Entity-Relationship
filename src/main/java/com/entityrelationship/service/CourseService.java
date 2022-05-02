package com.entityrelationship.service;

import com.entityrelationship.dto.AddReviewDto;
import com.entityrelationship.dto.AddStudentCourseDTO;
import com.entityrelationship.entity.Course;
import com.entityrelationship.entity.Review;

import java.util.List;

public interface CourseService {
    public Course save(Course course);
    public Course getById(int id);
    public List<Course> find();
    public Course addStudent(AddStudentCourseDTO addStudentCourseDTO);
    Review addStudent(Review review, int course_id);
}
