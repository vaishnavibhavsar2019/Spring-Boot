package alumini.managment.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alumini.managment.entity.Alumini;
import alumini.managment.entitydto.AluminiDTO;
import alumini.managment.exception.UserNotFoundException;
import alumini.managment.repository.Aluminirepository;
import alumini.managment.service.AluminiService;

	@Service
	public class AluminiServicelpl implements AluminiService 
	{
		@Autowired
		private  Aluminirepository aluminiRepository;

		@Override
		public List<Alumini> getAllAlumini() 
		{
			
			return aluminiRepository.findAll();
		}

		@Override
		public Alumini createAlumini(AluminiDTO aluminiDTO) 
		{
			Alumini alumini = Alumini.builder().name(aluminiDTO.getName()).email(aluminiDTO.getEmail()).phone(aluminiDTO.getPhone())
					.grdYear(aluminiDTO.getGrdYear()).build();
			return aluminiRepository.save(alumini);
		}

		@Override
		public Alumini updateAlumini(int id, AluminiDTO aluminiDTO) throws UserNotFoundException
		{
			Optional <Alumini> sdata= aluminiRepository.findById(id);
			if(sdata.isEmpty())
			{
				Alumini _alumini = aluminiRepository.findById(id).get();
				_alumini.setName(aluminiDTO.getName());
				_alumini.setPhone(aluminiDTO.getPhone());
				_alumini.setEmail(aluminiDTO.getEmail());
				_alumini.setGrdYear(aluminiDTO.getGrdYear());
				
				return aluminiRepository.save(_alumini);
			}
			else throw new UserNotFoundException("No User bearing id "+id+" can be found");
		}

		@Override
		public Alumini getAllAluminiById(int id) 
		{
			return aluminiRepository.findById(id).orElseThrow(() -> new UserNotFoundException("No User bearing id "+id+" can be found"));
		}

		@Override
		public List<Alumini> findByNameContaining(String name) throws UserNotFoundException
		{
			if(aluminiRepository.findByNameContaining(name).isEmpty())
				throw new UserNotFoundException("No User bearing id "+name+" can be found");
			else
			return aluminiRepository.findByNameContaining(name);
		}

		@Override
		public List<Alumini> findByGrdYearContaining(String grdYear) 
		{
			if(aluminiRepository.findBygrdYearContaining(grdYear).isEmpty())
				throw new UserNotFoundException("No student with graduation "+grdYear+" can be found");
			else
			return aluminiRepository.findBygrdYearContaining(grdYear);
		}

		@Override
		public String deleteAlumini(int id) 
		{
			aluminiRepository.deleteById(id);
			return "Student bearing id "+id+" has been deleted successfully.....!";
		}
	}
