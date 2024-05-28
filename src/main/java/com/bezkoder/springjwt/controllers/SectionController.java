package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.bean.SectionSub;
import com.bezkoder.springjwt.models.Section;
import com.bezkoder.springjwt.models.SectionSubjects;
import com.bezkoder.springjwt.payload.request.SectionRequest;
import com.bezkoder.springjwt.payload.response.MessageResponse;
import com.bezkoder.springjwt.repository.SectionRepo;
import com.bezkoder.springjwt.repository.SectionSubjectRepo;
import com.bezkoder.springjwt.security.services.SectionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/section")
public class SectionController {
    @Autowired
    SectionRepo sectionRepo;
    @Autowired
    SectionSubjectRepo sectionSubjectRepo;

    @Autowired
    SectionService sectionService;




    @PostMapping("/addsection")
    public ResponseEntity<?> addsection(@Valid @RequestBody SectionRequest sectionRequest){
        Section cls = new Section(sectionRequest.getClassname(),sectionRequest.getTeachername(),sectionRequest.getYear());
        sectionRepo.save(cls);
        return  ResponseEntity.ok(new MessageResponse("Class Added successfully!"));
    }

    @GetMapping("/getSection")
//    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<Section> getSection() {
        return this.sectionRepo.findAll();
    }


//    @GetMapping("/getSectionSub")
////    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
//    public List<SectionSub> getSectionSub() {
//        return this.sectionSubjectRepo.getAllSubjects();
//    }
    @GetMapping("/getSection/{id}" )
//    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<SectionSubjects> findBySectionId(@PathVariable("id") Integer id) {
//        return this.sectionRepo.findById(id);
        return this.sectionService.findBySectionId(id);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Section>> searchSections(@RequestParam String searchText){
        List<Section> foundSections = sectionService.searchSections(searchText);
        if (!foundSections.isEmpty()) {
            return ResponseEntity.ok(foundSections);
        } else {
            return ResponseEntity.noContent().build();
        }
    }


}
