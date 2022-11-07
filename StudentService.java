package com.bnt.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnt.dao.StudentDao;
import com.bnt.model.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;

	@Transactional
	public Student addStudent(Student student) {
		return studentDao.addStudent(student);
	}

}
