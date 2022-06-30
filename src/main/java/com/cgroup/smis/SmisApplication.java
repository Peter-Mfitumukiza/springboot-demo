package com.cgroup.smis;

import com.cgroup.smis.model.Student;
import com.cgroup.smis.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class SmisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmisApplication.class, args);
	}

//	@Bean
//	CommandLineRunner commandLineRunner(StudentRepository studentRepository){
//		return args -> {
//			Student student1 = new Student( "Josee", "Mugabo",
//					"jmugabo@gmail.com", LocalDate.of(2000, 4, 30));
//			Student student2 = new Student("Mary", "Margareth", "mmargareth@gmail.com",
//					LocalDate.of(2010, 12, 4));
//			List<Student> students = new ArrayList<Student>();
//			students.add(student1);
//			students.add(student2);
//			studentRepository.saveAll(students);
//		};
//	}

}
