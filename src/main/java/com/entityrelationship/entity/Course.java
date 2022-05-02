package com.entityrelationship.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.LifecycleState;
import org.hibernate.engine.profile.Fetch;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "shenba_course")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String course_name;
    @ManyToMany(fetch = FetchType.EAGER)
    List<Student>students=new ArrayList<>();
    @OneToMany(cascade =CascadeType.ALL)
    private List<Review> reviews;
}
//(fetch = FetchType.EAGER)