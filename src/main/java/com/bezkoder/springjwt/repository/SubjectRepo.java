package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepo extends JpaRepository<Subject, Integer> {
}
