package com.bezkoder.springjwt;

import com.bezkoder.springjwt.models.Student;
import com.bezkoder.springjwt.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringBootSecurityJwtApplication {

	public static void main(String[] args) {
    SpringApplication.run(SpringBootSecurityJwtApplication.class, args);



	}
	@Autowired
	private StudentRepository studentRepository;

	public void run(String... args)throws Exception{
//	this.studentRepository.save(new Student("Shivann","metri","oo","ss","shivanna@gmail.com", "1997-02-01",987654,"hindu","sc","male","1234567890","kalburgi"));

	}

}
