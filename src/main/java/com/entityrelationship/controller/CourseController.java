package com.entityrelationship.controller;

import com.entityrelationship.dto.AddReviewDto;
import com.entityrelationship.dto.AddStudentCourseDTO;
import com.entityrelationship.dto.CourseDto;
import com.entityrelationship.entity.Course;
import com.entityrelationship.entity.Review;
import com.entityrelationship.service.CourseServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private CourseServiceImpl service;
    @PostMapping("/course")
    public CourseDto addCourse(@RequestBody CourseDto courseDto){
        Course course=modelMapper.map(courseDto,Course.class);
        course= service.save(course);
        return modelMapper.map(course,CourseDto.class);
    }
    @GetMapping("/course/{id}")
    public CourseDto getById(@PathVariable ("id")int id){
        Course course= service.getById(id);
        CourseDto courseDto=modelMapper.map(course,CourseDto.class);
        return courseDto;

    }
    @GetMapping("/course")
    public List<Course>findall(){
        return service.find();
    }
    @PostMapping("/student/add/course")
    public Course addStudent(@RequestBody AddStudentCourseDTO addStudentCourseDTO){
//        Course course= modelMapper.map(addStudentCourseDTO,Course.class);
        return service.addStudent(addStudentCourseDTO);
//        return modelMapper.map(course,CourseDto.class);

    }
    @PostMapping("/course/add/review")
    public Review addStudent(@RequestBody AddReviewDto addReviewDto){
        Review review = new Review(addReviewDto.getRating(), addReviewDto.getComment());
        return service.addStudent(review, addReviewDto.getCourse_id());
    }

}
