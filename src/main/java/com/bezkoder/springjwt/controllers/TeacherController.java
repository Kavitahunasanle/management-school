package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.models.Student;
import com.bezkoder.springjwt.models.Teacher;
import com.bezkoder.springjwt.payload.request.TeacherRequest;
import com.bezkoder.springjwt.payload.response.MessageResponse;
import com.bezkoder.springjwt.repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teacher")
public class TeacherController {

    @Autowired
    private TeacherRepo teacherRepo;

    @PostMapping("/addTeacher")
    public ResponseEntity<?>createTeacher(@RequestBody TeacherRequest teacher){
        Teacher staf= new Teacher(teacher.getFirstname(),teacher.getLastname(),teacher.getDob(),teacher.getContact(),teacher.getDeptid(),teacher.getGender(),teacher.getAdhaarNo(),teacher.getPlaceOfBirth(),teacher.getPan(),teacher.getGrade(),teacher.getAddress());
        teacherRepo.save(staf);
        return ResponseEntity.ok(new MessageResponse("Teacher register successfully"));
    }

    @GetMapping("/getTeacher")
//    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<Teacher> getTeacher(){
        return this.teacherRepo.findAll();
    }
}
