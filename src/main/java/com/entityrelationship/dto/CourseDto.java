package com.entityrelationship.dto;

import lombok.Data;

import javax.persistence.Entity;

@Data
public class CourseDto {
    private int id;
    private String course_name;
}
