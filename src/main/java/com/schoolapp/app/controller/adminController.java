package com.schoolapp.app.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.schoolapp.app.model.students;
import com.schoolapp.app.model.teachers;
import com.schoolapp.app.repository.studentsRepository;
import com.schoolapp.app.repository.teachersRepository;



@RestController
@RequestMapping("/api")
public class adminController {
	
	Logger log = LoggerFactory.getLogger(adminController.class);
	
	@Autowired
	private teachersRepository repository1;
	@Autowired
	private studentsRepository repository2;
	
	@PostMapping("/admin/addStudent")
	public String saveStudent(@RequestBody students stud) {
		log.debug("Admin Added a Student or Updated a Student with an Id: "+stud.getId());
		repository2.save(stud);
		return "student added with id : " +stud.getId();
		
	}
	
	@GetMapping("/admin/getStudents")
	public List<students> getStudents(){
		log.debug("Admin got the all Students Info");
		return repository2.findAll();
	}
	@GetMapping("/admin/findStudent/{id}")
	public Optional<students> getStudent(@PathVariable int id){
		log.debug("Admin found a Student with an Id: "+id);
		return repository2.findById(id);
	}
	
	@DeleteMapping("/admin/deleteStudent/{id}")
	public String deleteStudent(@PathVariable int id) {
		log.debug("Admin deleted a Student by an Id: "+id);
		repository2.deleteById(id);
		return "Student Deleted with id : " +id;
	}
	@PostMapping("/admin/addTeacher")
	public String saveTeacher(@RequestBody teachers tech) {
		log.debug("Admin Added a Student or Updated a Student with an Id: "+tech.getId());
		repository1.save(tech);
		return "Teacher added with id : " +tech.getId();
		
	}
	
	@GetMapping("/admin/getTeachers")
	public List<teachers> getTeachers(){
		log.debug("Admin got the all Teachers Info");
		return repository1.findAll();
	}
	@GetMapping("/admin/findTeacher/{id}")
	public Optional<teachers> getTeacher(@PathVariable int id){
		log.debug("Admin found a Teacher with an Id: "+id);
		return repository1.findById(id);
	}
	
	@DeleteMapping("/admin/deleteTeacher/{id}")
	public String deleteTeacher(@PathVariable int id) {
		log.debug("Admin deleted a Teacher by an Id: "+id);
		repository1.deleteById(id);
		return "Student Deleted with id : " +id;
	}
	

}
