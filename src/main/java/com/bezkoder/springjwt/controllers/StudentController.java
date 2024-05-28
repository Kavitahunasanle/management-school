package com.bezkoder.springjwt.controllers;


import com.bezkoder.springjwt.models.Student;
import com.bezkoder.springjwt.payload.request.StudentRequest;
import com.bezkoder.springjwt.payload.response.MessageResponse;
import com.bezkoder.springjwt.repository.StudentRepository;
import com.bezkoder.springjwt.security.services.StudentSevices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private StudentSevices studentSevices;


//    public StudentController(StudentSevices studentSevices){
//        this.studentSevices=studentSevices;
//    }

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/addStd")
    public ResponseEntity<?> createStudent(@RequestBody @Valid StudentRequest student) {
        if(studentRepository.existsByFirstname(student.getFirstname())&&studentRepository.existsByLastname(student.getLastname())&& studentRepository.existsByMothername(student.getMothername())&& studentRepository.existsByDob(student.getDob())){
            return ResponseEntity.badRequest().body(new MessageResponse("Student already registered"));
        }
        Student std= new Student(student.getFirstname(),student.getLastname(), student.getFathername(),student.getMothername(),student.getEmail(),student.getDob(),student.getContact(),student.getReligion(),student.getCaste(),student.getGender(),student.getAdhaarNo(),student.getAddress(),student.getSatsid(),student.getSchool(),student.getSection());
        studentRepository.save(std);

        //creating students
//        studentSevices.createStudent(std);
        return ResponseEntity.ok(new MessageResponse("Student register successfully"));

    }

//    @GetMapping("/getStudent")
//    @DeleteMapping("/deleteStudent/{id}")
//    @PutMapping("/updateStudent/{id}")
//    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
//    public List<Student> getStudent(){
//    public Student getStudents(@PathVariable Integer id, @RequestBody Student studentDetails){
//    public String getStudents(@PathVariable Integer id){
//        return this.studentSevices.updateStudent(id,studentDetails);
//        return this.studentSevices.getAllStudents();
//    }

    @GetMapping("/getStudent")
    public List<Student> getAllStudents() {
        return studentSevices.getAllStudents();
    }


    @GetMapping("/getStudent/{id}")
    public Student getStudentById(@PathVariable("id") Integer id) {
        return studentSevices.getStudentById(id);
    }


    @PutMapping("/updateStudent/{id}")
    public Student updateStudent(@PathVariable Integer id,@RequestBody Student studentDetails){
        return  studentSevices.updateStudent(id,studentDetails);
    }


    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable Integer id){
        return  studentSevices.deleteStudent(id);

    }
}
