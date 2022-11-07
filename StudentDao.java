package com.bnt.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bnt.model.Student;
@Repository
public class StudentDao {
	@Autowired
	private SessionFactory sessionFactory;

	public Student addStudent(Student student) {
		sessionFactory.getCurrentSession().save(student);
		return student;
	}

}
