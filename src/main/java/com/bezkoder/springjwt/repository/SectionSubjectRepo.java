package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.bean.SectionSub;
import com.bezkoder.springjwt.models.SectionSubjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SectionSubjectRepo extends JpaRepository<SectionSubjects, Integer> {

    List<SectionSubjects> findBySectionId(Integer section_id);

//    @Query("SELECT * FROM SectionSubject")
//    public List<SectionSub> getAllSubjects();
}
