package com.bezkoder.springjwt.controllers;


import com.bezkoder.springjwt.models.Subject;
import com.bezkoder.springjwt.payload.request.SubjectRequest;
import com.bezkoder.springjwt.payload.response.MessageResponse;
import com.bezkoder.springjwt.repository.SubjectRepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("/api/subjects")
public class SubjectController {

    @Autowired
    SubjectRepo subjectRepo;

    @PostMapping("/addsubjects")
    public ResponseEntity<?>addsubjects(@Valid @RequestBody SubjectRequest subjectRequest){
        Subject sub = new Subject(subjectRequest.getSubjectName(),subjectRequest.getMedium(),subjectRequest.getTeachername());
        subjectRepo.save(sub);
        return ResponseEntity.ok(new MessageResponse("Subject added successfully"));
    }

    @GetMapping("/getSub")
//    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<Subject>getSubject(){
        return this.subjectRepo.findAll();
    }
}
