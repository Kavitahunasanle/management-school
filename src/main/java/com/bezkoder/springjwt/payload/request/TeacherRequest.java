package com.bezkoder.springjwt.payload.request;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Date;

public class TeacherRequest {

    @NotBlank
    @Size(max = 20)
    private String firstname;
    @NotBlank
    @Size(max = 20)
    private String lastname;
    @NotBlank
    @Size(max = 20)
    private String dob;
    @NotBlank
    @Size(max = 20)
    private long contact;
//    @NotBlank
    @Size(max = 10)
    private int deptid;
    @NotBlank
    @Size(max = 20)
    private String gender;
//    @NotBlank
//    @Size(max = 20)
    private long adhaarNo;
    @NotBlank
    @Size(max = 20)
    private String placeOfBirth;
    @NotBlank
    @Size(max = 20)
    private String pan;
//    @NotBlank
//    @Size(max = 20)
    private char grade;
    @NotBlank
    @Size(max = 50)
    private String address;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getAdhaarNo() {
        return adhaarNo;
    }

    public void setAdhaarNo(long adhaarNo) {
        this.adhaarNo = adhaarNo;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
