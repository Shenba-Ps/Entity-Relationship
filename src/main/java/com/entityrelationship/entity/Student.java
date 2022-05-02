package com.entityrelationship.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "shine_student")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @OneToOne(fetch = FetchType.EAGER)
    @JsonManagedReference
    private Passport passport;
    @ManyToMany(fetch = FetchType.EAGER)
    @JsonBackReference
    List<Course>courses=new ArrayList<>();

}
