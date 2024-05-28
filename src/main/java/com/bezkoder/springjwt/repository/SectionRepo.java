package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SectionRepo extends JpaRepository<Section,Integer> {

    @Query("SELECT a FROM Section a WHERE " +
            "LOWER(a.classname) LIKE LOWER(CONCAT('%', :searchText, '%')) ")
    List<Section> findSectionsBySearchText(@Param("searchText") String searchText);
}
