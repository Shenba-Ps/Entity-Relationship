package com.entityrelationship.service;

import com.entityrelationship.dao.CourseDaoImpl;
import com.entityrelationship.dto.AddReviewDto;
import com.entityrelationship.dto.AddStudentCourseDTO;
import com.entityrelationship.entity.Course;
import com.entityrelationship.entity.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseDaoImpl courseDao;
    @Override
    public Course save(Course course) {

        return courseDao.save(course);
    }

    @Override
    public Course getById(int id) {

        return courseDao.getById(id);
    }

    @Override
    public List<Course> find() {
        return courseDao.find();
    }

    @Override
    public Course addStudent(AddStudentCourseDTO addStudentCourseDTO) {
        return courseDao.addStudent(addStudentCourseDTO);
    }



    @Override
    public Review addStudent(Review review, int course_id){

        return courseDao.saveReview(review,course_id);
    }
}
