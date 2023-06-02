package bj.ifri.tpmaven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import bj.ifri.tpmaven.repositories.StudentRepository;
import bj.ifri.tpmaven.repositories.UniversityRepository;

@SpringBootApplication
@EnableAutoConfiguration
public class Application {

	@Autowired
	private StudentRepository studentRepo;

	@Autowired
	private UniversityRepository universityRepo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//		return args -> {
//
//			System.out.println(studentRepo.findAll());
//
//			University university = new University("IFRI", "EZIN Eugène", "20 21 22 23");
//			University universitySaved = universityRepo.save(university);
//
//			Student student = new Student("Robert", "DOSSOU", 25);
//			student.setUniversity(universitySaved);
//			studentRepo.save(student);
//
//			List<Student> students = studentRepo.findByLastname("DOSSOU");
//
//			System.out.println(students.size());
//
//		};
//	}

}
