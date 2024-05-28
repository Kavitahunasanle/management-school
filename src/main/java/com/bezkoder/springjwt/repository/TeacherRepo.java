package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Teacher,Integer> {
}
