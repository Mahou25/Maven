/**
 * 
 */
package bj.ifri.tpmaven.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bj.ifri.tpmaven.entities.Student;
import bj.ifri.tpmaven.repositories.StudentRepository;

/**
 * @author koukpaki
 *
 */
@RestController
@RequestMapping(value = "/api/students")
public class StudentController {

	@Autowired
	private StudentRepository studentRepo;

	@GetMapping(value = "/list")
	public List<Student> getAllStudents() {

		return studentRepo.findAll();

	}

	@GetMapping(value = "/find/{name}")
	public ResponseEntity<List<Student>> findByName(@PathVariable("name") String name) {

		return new ResponseEntity<List<Student>>(studentRepo.findByLastnameContains(name), HttpStatus.OK);
	}

}
