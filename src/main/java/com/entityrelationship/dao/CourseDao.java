package com.entityrelationship.dao;

import com.entityrelationship.dto.AddStudentCourseDTO;
import com.entityrelationship.entity.Course;
import com.entityrelationship.entity.Review;

import java.util.List;

public interface CourseDao {
    public Course save(Course course);
    public Course getById(int id);
    public List<Course> find();
    public Course addStudent(AddStudentCourseDTO addStudentCourseDTO);

    Review saveReview(Review review, int course_id);
}
