package com.entityrelationship.dao;

import com.entityrelationship.dto.AddStudentCourseDTO;
import com.entityrelationship.entity.Course;
import com.entityrelationship.entity.Review;
import com.entityrelationship.entity.Student;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CourseDaoImpl implements CourseDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Course save(Course course) {
        entityManager.persist(course);
        return course;
    }

    @Override
    public Course getById(int id) {
       return entityManager.find(Course.class,id);
    }

    @Override
    public List<Course> find() {
        return  entityManager.createQuery("from Course")
                .getResultList();
    }

    @Override
    public Course addStudent(AddStudentCourseDTO addStudentCourseDTO) {
        Course course = entityManager.find(Course.class, addStudentCourseDTO.getCourse_id());
        //create a graduate object
        Student student = new Student();
        // set the graduate id to graduate object
        student.setId(addStudentCourseDTO.getStudent_id());
        //get the course graduate list and add a graduate
        course.getStudents().add(student);
        //save the updated course
        entityManager.persist(course);
        // return the course
        return course;
    }
    @Override
    public Review saveReview(Review review, int course_id) {
        Course course = entityManager.find(Course.class, course_id);
        course.getReviews().add(review);
        entityManager.persist(course);
        return review;
    }
}
