package com.entityrelationship.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Studentdto {
    private int id;
    private String name;
    private String passport_number;
}
