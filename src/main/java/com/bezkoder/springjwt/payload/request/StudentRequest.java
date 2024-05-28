package com.bezkoder.springjwt.payload.request;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.sql.Date;

public class StudentRequest {
    @NotBlank(message = "first name shouldn't be null")
    private String firstname;
    @NotBlank(message = "last name shouldn't be null")
    private String lastname;
    @NotBlank(message = "father name shouldn't be null")
    private String fathername;
    @NotBlank(message = "mother name shouldn't be null")

    private String mothername;
   @Email
    private String email;
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$",message = "Invalid DOB")
    private String dob;
//    @NotBlank
    @Pattern(regexp = "^[6789]\\d{9}$", message = "Invalid mobile number")
    private String contact;
    @NotBlank
    private String religion;
    @NotBlank
    private String caste;
    @NotBlank
    private String gender;
//    @NotBlank
//    @Size(max = 20)
    private long adhaarNo;
    @NotBlank
    @Size(max = 600)
    private String address;

    @NotBlank
    @Size(max = 10)
    private String satsid;
    @NotBlank
    @Size(max = 60)
    private String school;
    @NotBlank
    @Size(max = 60)
    private String section;

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

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getMothername() {
        return mothername;
    }

    public void setMothername(String mothername) {
        this.mothername = mothername;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        this.caste = caste;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSatsid() {
        return satsid;
    }

    public void setSatsid(String satsid) {
        this.satsid = satsid;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
