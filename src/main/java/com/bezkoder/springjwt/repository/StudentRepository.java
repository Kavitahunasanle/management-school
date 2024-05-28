package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    boolean existsByFirstname(String firstname);
    boolean existsByLastname(String lastname);
    boolean existsByMothername(String mothername);
    boolean existsByDob(String dob);
}
