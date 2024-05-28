package com.bezkoder.springjwt.security.services;

import com.bezkoder.springjwt.models.Student;
import com.bezkoder.springjwt.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentSevices {
    @Autowired
    private  StudentRepository studentRepository;

    @Autowired
//    public StudentSevices(StudentRepository studentRepository) {
//        this.studentRepository = studentRepository;
//    }

    // crud operations for students

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student getStudentById(Integer id){
    return studentRepository.findById(id).orElse(null);
    }

    public Student createStudent(Student student){
        return studentRepository.save(student);
    }

    public Student updateStudent(Integer id, Student studentDetails){
        Student student =studentRepository.findById(id).orElseThrow(()->new NullPointerException("Null pointer "+ id));
        if (student!=null){
            student.setFirstname(studentDetails.getFirstname());
            student.setLastname(studentDetails.getLastname());
            student.setFathername(studentDetails.getFathername());
            student.setMothername(studentDetails.getMothername());
            student.setDob(studentDetails.getDob());
            student.setContact(studentDetails.getContact());
            student.setEmail(studentDetails.getEmail());
            student.setCaste(studentDetails.getCaste());
            student.setReligion(studentDetails.getReligion());
            student.setGender(studentDetails.getGender());
            student.setAddress(studentDetails.getAddress());
            student.setAdhaarNo(studentDetails.getAdhaarNo());
            student.setSection(studentDetails.getSection()) ;
            student.setSatsid(studentDetails.getSatsid());
            student.setSchool(studentDetails.getSchool());
            return studentRepository.save(student);
        }
        return null;
    }

    public String deleteStudent(Integer id){
        studentRepository.deleteById(id);
        return id+ "  deleted successfully";
    }

}
