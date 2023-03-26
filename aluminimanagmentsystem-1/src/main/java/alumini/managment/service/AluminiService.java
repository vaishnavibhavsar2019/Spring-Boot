package alumini.managment.service;

import java.util.List;

import alumini.managment.entity.Alumini;
import alumini.managment.entitydto.AluminiDTO;

	public interface AluminiService 
	{
		//To get All the records of student
		List<Alumini> getAllAlumini();
		
		//To add new Student using id
		Alumini createAlumini(AluminiDTO aluminiDTO);
		
		//To update an Student using id
		Alumini updateAlumini(int id,AluminiDTO aluminiDTO);
		
		//To display an Student using id
		Alumini getAllAluminiById(int id);
		
		//To display an Student using its name
		List<Alumini> findByNameContaining(String name);

		//To display an Student using its name
		List<Alumini> findByGrdYearContaining(String grdYear);
		
		//To delete an Student by its id
		String deleteAlumini(int id);
	}

