package alumini.managment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import alumini.managment.entity.Alumini;


	public interface Aluminirepository extends JpaRepository<Alumini,Integer> 
	{
		List<Alumini> findByNameContaining(String name);
		List<Alumini> findBygrdYearContaining(String grdYear);
	}
