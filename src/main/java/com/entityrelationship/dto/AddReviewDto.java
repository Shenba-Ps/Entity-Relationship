package com.entityrelationship.dto;

import lombok.Data;

@Data
public class AddReviewDto {
    private int course_id;
    private int rating;
    private String comment;
}
