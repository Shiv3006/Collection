package com.bnt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bnt.model.Student;

@RestController
public class StudController {
	@Autowired
	private com.bnt.service.StudentService StudentService;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Student save(@RequestBody Student student) {
		StudentService.addStudent(student);
		System.out.println(student);
		return student;

	}


}
