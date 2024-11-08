package com.example.user.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.Entity.StudentTable;
import com.example.user.Repositary.StudentRepo;

@RestController
public class StudentController {

	//find all the student data
	@Autowired
	StudentRepo stuRepo;
	@GetMapping("/student")
	//localhost:8080/Students
	public List<StudentTable> allStudents()
	{	
		List<StudentTable> std=stuRepo.findAll();
		return std;
	}
	//find the student data by id
	@GetMapping("/student/{id}")
	//localhost:8080/student/1
	public StudentTable getdatabtid(@PathVariable int id) {
		StudentTable st=stuRepo.findById(id).get();
		return st;
	}
	
	//add the student data
	@PostMapping("/student/add")
	@ResponseStatus(code=HttpStatus.ACCEPTED)
	public void createStudent(@RequestBody StudentTable student) {
		stuRepo.save(student);
	}
	
	//update the studentdata
	@PutMapping("/student/update/{id}")
	public StudentTable updateTable(@PathVariable int id) {
		StudentTable st=stuRepo.findById(id).get();
		st.setName("Bhaskar");
		st.setBranch("Mechnical");
		st.setRollno(2155);
		stuRepo.save(st);
		return st;
	}
	//Delete the data by id
	@DeleteMapping("/student/delete/{id}")
	@ResponseStatus(code=HttpStatus.ACCEPTED)
	public void removeData(@PathVariable int id)
	{	
		StudentTable std=stuRepo.findById(id).get();
		stuRepo.delete(std);
	}
	
	
}
