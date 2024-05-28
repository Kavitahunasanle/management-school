package com.bezkoder.springjwt.security.services;

import com.bezkoder.springjwt.models.Section;
import com.bezkoder.springjwt.models.SectionSubjects;
import com.bezkoder.springjwt.repository.SectionRepo;
import com.bezkoder.springjwt.repository.SectionSubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionService {

    @Autowired
    SectionSubjectRepo sectionSubjectRepo;

    @Autowired
    SectionRepo sectionRepo;




    public List<SectionSubjects> findBySectionId(Integer id){
        return this.sectionSubjectRepo.findBySectionId(id);
    }



    public List<Section> searchSections(String searchText) {
        return sectionRepo.findSectionsBySearchText(searchText);
    }


}
