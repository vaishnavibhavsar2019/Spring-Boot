package alumini.managment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import alumini.managment.entity.Alumini;
import alumini.managment.repository.Aluminirepository;

@SpringBootApplication
public class Aluminimanagmentsystem1Application implements CommandLineRunner
{

		@Autowired
		private Aluminirepository aluminiRepository;
		public static void main(String[] args) 
		{
			SpringApplication.run(Aluminimanagmentsystem1Application.class, args);
		}
		
		public void run(String ... args) throws Exception
		{
			Alumini a1 = Alumini.builder().name("VAISHU").phone("8080306284").email("A@gmail.com").grdYear("2022").build();
			Alumini a2 = Alumini.builder().name("POOJA").phone("9470934284").email("B@gmail.com").grdYear("2021").build();
			Alumini a3 = Alumini.builder().name("MAKI").phone("9483479284").email("C@gmail.com").grdYear("2023").build();
			Alumini a4 = Alumini.builder().name("PARU").phone("868341284").email("D@gmail.com").grdYear("2023").build();
			
			aluminiRepository.save(a1);
			aluminiRepository.save(a2);
			aluminiRepository.save(a3);
			aluminiRepository.save(a4);
			
		}
	}
