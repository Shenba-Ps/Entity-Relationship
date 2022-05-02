package com.entityrelationship.dao;

import com.entityrelationship.entity.Passport;
import com.entityrelationship.entity.Student;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Student save(Student student, Passport passport) {
        entityManager.persist(passport);
        student.setPassport(passport);
        entityManager.persist(student);
        return student;
    }

    @Override
    public Student findById(int id) {
//        Session currentSession = entityManager.unwrap(Session.class);
//       Student student = currentSession.get(Student.class, id);
//        return student;
        return entityManager.find(Student.class,id);
    }

    @Override
    public List<Student> findAll() {
//        Session currentSession = entityManager.unwrap(Session.class);
        Query query = (Query)entityManager.createQuery("from Student", Student.class);
        List<Student> students = query.getResultList();
        return students;
    }

    @Override
    public Student updateStudentById(Student student) {

        return null;
    }

    @Override
    public void deletebyid(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query query = currentSession.createQuery("delete from Student where id=:id");
        query.setParameter("id", id);
        query.executeUpdate();

    }
}
