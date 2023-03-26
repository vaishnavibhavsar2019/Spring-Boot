package alumini.management.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import alumini.managment.entity.Alumini;
import alumini.managment.entitydto.AluminiDTO;
import alumini.managment.service.AluminiService;

@RestController
@RequestMapping("/api")
public class AluminiController {

	
	//Constructor Injection
			private AluminiService aluminiService;
			
			//Add a new Student
			@PostMapping("/students")
			public ResponseEntity<Alumini> createAlumini(@RequestBody @Valid AluminiDTO a)
			{
				Alumini a1 = aluminiService.createAlumini(a);
				return new ResponseEntity<>(a1, HttpStatus.CREATED);
			}
			//update student
			@PutMapping("/students/{id}")
			public ResponseEntity<Alumini> updateAlumini(@PathVariable("id") int id,@RequestBody AluminiDTO aluminiDTO)
			{
				aluminiService.updateAlumini(id, aluminiDTO);
				return ResponseEntity.ok().body(aluminiService.updateAlumini(id, aluminiDTO));
			}
			
			//display Student
			@GetMapping("/studentname")
			public ResponseEntity<List<Alumini>> getStudentByStd_Name(@RequestParam(required = false) String name)
			{
				List<Alumini> alumini = aluminiService.findByNameContaining(name);
				return ResponseEntity.ok(alumini);
			}
			
			@GetMapping("/srudentgrade")
			public ResponseEntity<List<Alumini>> findByGrdYearContaining(@RequestParam(required = false) String grdYear)
			{
				List<Alumini> alumini = aluminiService.findByGrdYearContaining(grdYear);
				return ResponseEntity.ok(alumini);
			}
			
			@GetMapping("/students/{id}")
			public ResponseEntity<Alumini> getAllAluminiById(@PathVariable int id)
			{
				return ResponseEntity.ok().body(aluminiService.getAllAluminiById(id));
			}
			
			@DeleteMapping("/students/{id}")
			public ResponseEntity<Alumini> deleteAlumini(@PathVariable int id)
			{
				aluminiService.deleteAlumini(id);
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			@GetMapping("/students")
			public ResponseEntity<List<Alumini>> fetchAllStudents()
			{
				List<Alumini> alumini = aluminiService.getAllAlumini();
				return ResponseEntity.ok(alumini);
			}
		}
